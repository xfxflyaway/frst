package com.simpleway.frst.config;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.simpleway.frst.domain.dto.SmAuth;
import com.simpleway.frst.service.SmAuthService;
import com.simpleway.frst.shiro.MyShiroRealm;
import com.simpleway.frst.shiro.RetryLimitHashedCredentialsMatcher;

@Component
@Configuration
public class ShiroConfig {

//	private static final Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

	@Bean(name = "ehCache")
	public EhCacheManager getEhCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:config/shiro/ehcache-shiro.xml");
		return em;
	}


	@Bean
	public CredentialsMatcher credentialsMatcher() throws Exception {
		HashedCredentialsMatcher hashedCredentialsMatcher = new RetryLimitHashedCredentialsMatcher(getEhCacheManager());
		hashedCredentialsMatcher.setHashAlgorithmName("md5");
		hashedCredentialsMatcher.setHashIterations(2);
		hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
		return hashedCredentialsMatcher;
	}

	@Bean(name = "myShiroRealm")
	public MyShiroRealm myShiroRealm() throws Exception {
		MyShiroRealm realm = new MyShiroRealm();
		realm.setCredentialsMatcher(credentialsMatcher());
		realm.setAuthorizationCachingEnabled(false);
		return realm;
	}
	
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(MyShiroRealm myShiroRealm) throws Exception {
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(myShiroRealm);
		dwsm.setSessionManager(sessionManager());
		return dwsm;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
		filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
		// 该值缺省为false,表示生命周期由SpringApplicationContext管理,设置为true则表示由ServletContainer管理
		filterRegistration.addInitParameter("targetFilterLifecycle", "true");
		filterRegistration.setEnabled(true);
		filterRegistration.addUrlPatterns("/*");
		return filterRegistration;
	}

	@Bean
	public DefaultWebSessionManager sessionManager() throws Exception {
		DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
		sessionManager.setGlobalSessionTimeout(1800000);// 1800000
		sessionManager.setSessionValidationInterval(1800000);
		sessionManager.setSessionIdCookieEnabled(true);
		return sessionManager;
	}
	
	/**
	 * 
	 * @Description: 加载shiroFilter权限控制规则（从数据库读取然后配置） @param TODO @return
	 *               void @throws
	 */
	private void loadShiroFilterChain(ShiroFilterFactoryBean shiroFilterFactoryBean, SmAuthService smAuthService) {
		/////////////////////// 下面这些规则配置最好配置到配置文件中 ///////////////////////
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		// authc：该过滤器下的页面必须验证后才能访问
		// anon：它对应的过滤器里面是空的,什么都没做
//		logger.info("##################从数据库读取权限规则，加载到shiroFilter中##################");
		filterChainDefinitionMap.put("/frst/auth/login", "anon");
		List<SmAuth> findSmAuthList = smAuthService.findSmAuthList();
		for (SmAuth smAuth : findSmAuthList) {
			filterChainDefinitionMap.put(smAuth.getAuthUrl(), smAuth.getAuthOutCode());
		}
		filterChainDefinitionMap.put("/**", "authc");

		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
	}

	/**
	 * ShiroFilterFactoryBean @Description: * ShiroFilter<br/>
	 * @param TODO @return
	 * ShiroFilterFactoryBean @throws
	 */
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager, SmAuthService smAuthService) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		// 必须设置 SecurityManager
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		// 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		shiroFilterFactoryBean.setLoginUrl("/frst/auth/forwardLogin");
		// 登录成功后要跳转的连接
		shiroFilterFactoryBean.setUnauthorizedUrl("/frst/auth/noPermission");
		loadShiroFilterChain(shiroFilterFactoryBean, smAuthService);
		return shiroFilterFactoryBean;
	}
}
