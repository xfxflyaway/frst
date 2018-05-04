package com.simpleway.frst.shiro;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.SmAuth;
import com.simpleway.frst.domain.dto.SmUser;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.exception.YtfmUserErrors;
import com.simpleway.frst.service.SmAuthService;
import com.simpleway.frst.service.UserLoginService;
import com.yuntu.exception.YtException;

/**
 * 
 * @Description TODO
 * @author huangfan
 * @since TODO
 * @Date 2016-2-16
 */
public class MyShiroRealm extends AuthorizingRealm {

	@Autowired
	UserLoginService userLoginService;
	@Autowired
	SmAuthService smAuthService;

	private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	/**
	 * 权限认证，为当前登录的Subject授予角色和权限
	 * 
	 * @see 经测试：本例中该方法的调用时机为需授权资源被访问时
	 * @see 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
	 * @see 经测试：如果连续访问同一个URL（比如刷新），该方法不会被重复调用，Shiro有一个时间间隔（也就是cache时间，
	 *      在redisCache中设置），超过这个时间间隔再刷新页面，该方法会被执行
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String loginCode = (String) principalCollection.getPrimaryPrincipal();
		UserLogin userLogin = userLoginService.findUserLoginByName(loginCode);
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		List<SmAuth> smAuthList = null;
		if (userLogin.getType() == 1) {
			smAuthList = smAuthService.findSmAuthList();
		} else {
			smAuthList = smAuthService.findSmAuthListByUserId(userLogin.getLoginId());
		}
		for (SmAuth auth : smAuthList) {
			String perm = auth.getAuthInnerCode();
			if (StringUtils.isNotBlank(perm)) {
				simpleAuthorizationInfo.addStringPermission(perm);
			}
		}
		return simpleAuthorizationInfo;
	}

	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		// UsernamePasswordToken对象用来存放提交的登录信息
		UserLogin userLogin = userLoginService.findUserLoginByName(authenticationToken.getPrincipal().toString());
		if (userLogin == null) {
			return null;
		}
		if (userLogin.getState() == BaseConstant.USER_DISABLE) {
			throw new YtException(YtfmUserErrors.USER_DISABLE);
		}
		if (userLogin.getState() == BaseConstant.USER_LOCK) {
			throw new YtException(YtfmUserErrors.USER_LOCK);
		}
		String salt = userLogin.getSalt();
		setSession(BaseConstant.SESSION_USER, userLogin);
		SimpleAuthenticationInfo simpleInfo = new SimpleAuthenticationInfo(userLogin.getLoginCode(), userLogin.getLoginPwd(), new ShiroSimpleByteSource(salt), getName());
		return simpleInfo;
	}

	private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}

	public void clearAllCachedAuthorizationInfo() {
		Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
		if (cache != null) {
			for (Object key : cache.keys()) {
				cache.remove(key);
			}
		}
	}
}