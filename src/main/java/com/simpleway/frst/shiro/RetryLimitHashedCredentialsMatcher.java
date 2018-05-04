package com.simpleway.frst.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.service.UserLoginService;


public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {
	@Autowired
	UserLoginService smUserService;
	
	private Cache<String, AtomicInteger> passwordRetryCache;

	public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		String username = (String) token.getPrincipal();
		// retry count + 1
		AtomicInteger retryCount = passwordRetryCache.get(username);
		if (retryCount == null) {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, retryCount);
		}
		String loginTimes = System.getProperty(BaseConstant.LOGIN_TIMES_NAME);
		Integer times = BaseConstant.LOGIN_TIMES;
		if(NumberUtils.isNumber(loginTimes)){
			times = Integer.getInteger(loginTimes);
		}
		int incrementAndGet = retryCount.incrementAndGet();
		System.out.println(incrementAndGet);
		if (incrementAndGet > times ) {
			// if retry count > x throw
			smUserService.updateUserLogInTimes(username);
			throw new ExcessiveAttemptsException();
		}

		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			// clear retry count
			passwordRetryCache.remove(username);
		}
		return matches;
	}
}
