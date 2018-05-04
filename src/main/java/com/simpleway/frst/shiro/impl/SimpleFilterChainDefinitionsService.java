package com.simpleway.frst.shiro.impl;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleway.frst.domain.dto.SmAuth;
import com.simpleway.frst.service.SmAuthService;
import com.simpleway.frst.shiro.AbstractFilterChainDefinitionsService;

@Service
public class SimpleFilterChainDefinitionsService extends AbstractFilterChainDefinitionsService {
	@Autowired
	SmAuthService smAuthService;

	@Override
	public Map<String, String> initOtherPermission() {
		Map<String, String> map = Collections.synchronizedMap(new LinkedHashMap<String, String>());
		List<SmAuth> SmAuthList = smAuthService.findSmAuthList();
		map.put("/frst/auth/login", "anon");
		for (SmAuth smAuth : SmAuthList) {
			map.put(smAuth.getAuthUrl(), smAuth.getAuthOutCode());
		}
		map.put("/**", "authc");
		return map;
	}

}
