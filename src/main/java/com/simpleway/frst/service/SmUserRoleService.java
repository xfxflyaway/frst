package com.simpleway.frst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleway.frst.domain.dto.SmUserRole;
import com.simpleway.frst.domain.dto.SmUserRoleExample;
import com.simpleway.frst.mapper.SmUserRoleMapper;

@Service
@Transactional
public class SmUserRoleService {
	@Autowired
	SmUserRoleMapper smUserRoleMapper;
	
	public List<SmUserRole> findUserRoleByUserId(Long loginId){
		SmUserRoleExample smUserRoleExample= new SmUserRoleExample();
		SmUserRoleExample.Criteria c = smUserRoleExample.createCriteria();
		c.andLoginIdEqualTo(loginId);
		return  smUserRoleMapper.selectByExample(smUserRoleExample);
	}

	public void insertSelective(SmUserRole smUserRole) {
		smUserRoleMapper.insertSelective(smUserRole);
	}

	public void delUserLoginRole(Long loginId) {
		smUserRoleMapper.delUserLoginRole(loginId);
	}
}
