package com.simpleway.frst.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.dto.SmRole;
import com.simpleway.frst.domain.dto.SmUserRole;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.domain.dto.UserLoginExample;
import com.simpleway.frst.domain.vo.UserLoginVo;
import com.simpleway.frst.exception.YtfmUserErrors;
import com.simpleway.frst.mapper.UserLoginMapper;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.util.SequenceUtil;
import com.yuntu.exception.YtException;

@Service
@Transactional
public class UserLoginService {
	@Autowired
	UserLoginMapper userLoginMapper;
	@Autowired
	EhCacheManager ehCacheManager;
	@Autowired
	SmUserRoleService smUserRoleService;
	@Autowired
	SmRoleService smRoleService;

	public void insertUserLogin(UserLoginVo userLoginVo) throws Exception {
		Random random = new Random();
		List<Long> smRoles = userLoginVo.getSmRoles();
		UserLogin userLogin = new UserLogin();
		BeanUtils.copyProperties(userLoginVo, userLogin);
		String salt = "";
		for (int i = 0; i < 2; i++) {
			salt += (char) (random.nextInt(26) + 97);
		}
		userLogin.setSalt(salt);
		Md5Hash md5Hash = new Md5Hash(userLogin.getLoginPwd(), salt, 2);
		userLogin.setLoginPwd(md5Hash.toString());
		userLogin.setState(BaseConstant.USER_NORMAL);
		userLogin.setLoginId(SequenceUtil.getSeqId());
		userLogin.setCreateTime(new Date());
		userLogin.setType(null);
		userLoginMapper.insertSelective(userLogin);
		for (Long roleId : smRoles) {
			SmUserRole smUserRole = new SmUserRole();
			smUserRole.setRoleId(roleId);
			smUserRole.setLoginId(userLogin.getLoginId());
			smUserRole.setId(SequenceUtil.getSeqId());
			smUserRoleService.insertSelective(smUserRole);
		}
	}

	public void updateUserLogin(UserLoginVo userLoginVo) throws Exception {
		List<Long> smRoles = userLoginVo.getSmRoles();
		UserLogin userLogin = new UserLogin();
		BeanUtils.copyProperties(userLoginVo, userLogin);
		userLoginMapper.updateByPrimaryKeySelective(userLogin);
		smUserRoleService.delUserLoginRole(userLogin.getLoginId());
		for (Long roleId : smRoles) {
			SmUserRole smUserRole = new SmUserRole();
			smUserRole.setRoleId(roleId);
			smUserRole.setLoginId(userLogin.getLoginId());
			smUserRole.setId(SequenceUtil.getSeqId());
			smUserRoleService.insertSelective(smUserRole);
		}
	}

	public void delUserLogin(Long id) {
		userLoginMapper.deleteByPrimaryKey(id);
		smUserRoleService.delUserLoginRole(id);
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public JsonPage<UserLoginVo> findUserLoginListByPage(BaseWhere baseWhere) throws Exception {
		Page<UserLoginVo> page = PageHelper.startPage(baseWhere.getPageNo(), baseWhere.getPageSize(), true);
		List<UserLogin> userLoginList = userLoginMapper.selectByExample(null);
		List<UserLoginVo> result = new ArrayList<UserLoginVo>();
		JsonPage<UserLoginVo> resultList = new JsonPage<UserLoginVo>(page);
		for (UserLogin userLogin : userLoginList) {
			UserLoginVo userLoginVo = new UserLoginVo();
			BeanUtils.copyProperties(userLogin, userLoginVo);
			List<SmUserRole> userRoleList = smUserRoleService.findUserRoleByUserId(userLogin.getLoginId());
			List<Long> roles = new ArrayList<Long>();
			List<String> roleNames = new ArrayList<String>();
			if (userRoleList != null && userRoleList.size() > 0) {
				for (SmUserRole ur : userRoleList) {
					SmRole smRole = smRoleService.findSmRoleById(ur.getRoleId());
					if (smRole != null) {
						roles.add(smRole.getRoleId());
						roleNames.add(smRole.getRoleName());
					}
				}
			}
			userLoginVo.setSmRoles(roles);
			userLoginVo.setRoleNames(roleNames);
			userLoginVo.setLoginPwd(null);
			result.add(userLoginVo);
		}
		resultList.setRows(result);
		return resultList;
	}

	public UserLogin findUserLoginByName(String loginCode) {
		UserLoginExample userLoginExample = new UserLoginExample();
		UserLoginExample.Criteria c = userLoginExample.createCriteria();
		c.andLoginCodeEqualTo(loginCode);
		List<UserLogin> selectByExample = userLoginMapper.selectByExample(userLoginExample);
		if (selectByExample != null && selectByExample.size() > 0) {
			return selectByExample.get(0);
		}
		return null;
	}

	public UserLogin findUserLoginById(Long id) {
		return userLoginMapper.selectByPrimaryKey(id);
	}
	
	public UserLoginVo SelectUserLoginById(Long id) {
		UserLogin userLogin= userLoginMapper.selectByPrimaryKey(id);
		if(userLogin==null)
			return null;
		UserLoginVo userLoginVo= new UserLoginVo();
		BeanUtils.copyProperties(userLogin, userLoginVo);
		List<SmUserRole> userRoleList = smUserRoleService.findUserRoleByUserId(userLogin.getLoginId());
		List<Long> roles = new ArrayList<Long>();
		List<String> roleNames = new ArrayList<String>();
		if (userRoleList != null && userRoleList.size() > 0) {
			for (SmUserRole ur : userRoleList) {
				SmRole smRole = smRoleService.findSmRoleById(ur.getRoleId());
				if (smRole != null) {
					roles.add(smRole.getRoleId());
					roleNames.add(smRole.getRoleName());
				}
			}
		}
		userLoginVo.setSmRoles(roles);
		userLoginVo.setRoleNames(roleNames);
		userLoginVo.setLoginPwd(null);
		return userLoginVo;
	}
	
	

	public void updateUserLogInTimes(String userName) {
		userLoginMapper.updateUserLogInTimes(userName);
	}

	public void clearLoginTimes(String userName) {
		Object object = ehCacheManager.getCache("passwordRetryCache").get(userName);
		if (object != null) {
			ehCacheManager.getCache("passwordRetryCache").remove(userName);
		}
	}

	public void unlockUserLogin(Long loginId) {
		userLoginMapper.unlockUserLogin(loginId);
	}

	public void enableUserLogin(Long loginId) {
		userLoginMapper.enableUserLogin(loginId);
	}

	public void disableUserLogin(Long loginId) {
		userLoginMapper.disableUserLogin(loginId);
	}

	public Boolean updateUserLoginPwd(Long loginId, String loginPwdOld, String loginPwd) {
		UserLogin userLogin = findUserLoginById(loginId);
		if (userLogin == null) {
			throw new YtException(YtfmUserErrors.USER_EMPTY);
		}
		Md5Hash md5Hash = new Md5Hash(loginPwdOld, userLogin.getSalt(), 2);
		if (md5Hash != null && md5Hash.toString().equals(userLogin.getLoginPwd())) {
			UserLogin userLoginWhere = new UserLogin();
			userLoginWhere.setLoginId(loginId);
			Md5Hash md5HashNew = new Md5Hash(loginPwd, userLogin.getSalt(), 2);
			userLoginWhere.setLoginPwd(md5HashNew.toString());
			userLoginMapper.updateByPrimaryKeySelective(userLoginWhere);
			return true;
		}
		return false;

	}

	public Boolean resetUserLoginPwd(Long loginId) {
		UserLogin userLogin = findUserLoginById(loginId);
		UserLogin userLoginWhere = new UserLogin();
		userLoginWhere.setLoginId(loginId);
		// String property = System.getProperty("resetUserPwd");
		String property = "123456";
		Md5Hash md5Hash = new Md5Hash(property, userLogin.getSalt(), 2);
		if ("".equals(property)) {
			return false;
		}
		userLoginWhere.setLoginPwd(md5Hash.toString());
		userLoginMapper.updateByPrimaryKeySelective(userLoginWhere);
		return true;
	}

}
