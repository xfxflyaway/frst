package com.simpleway.frst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.dto.SmRole;
import com.simpleway.frst.domain.dto.SmRoleAuth;
import com.simpleway.frst.domain.dto.SmRoleExample;
import com.simpleway.frst.domain.dto.SmUserRoleExample;
import com.simpleway.frst.domain.vo.SmAuthVo;
import com.simpleway.frst.domain.vo.SmRoleVo;
import com.simpleway.frst.mapper.SmRoleAuthMapper;
import com.simpleway.frst.mapper.SmRoleMapper;
import com.simpleway.frst.util.ConvertUtil;
import com.simpleway.frst.util.SequenceUtil;

@Service
@Transactional
public class SmRoleService {
	@Autowired
	SmRoleMapper smRoleMapper;
	@Autowired
	SmRoleAuthMapper smRoleAuthMapper;
	@Autowired
	SmAuthService smAuthService;

	public void insertSmRole(SmRoleVo smRoleVo) throws Exception {
		List<Long> smAuths = smRoleVo.getSmAuths();
		SmRole smRole = new SmRole();
		BeanUtils.copyProperties(smRoleVo, smRole);
		smRole.setRoleId(SequenceUtil.getSeqId());
		smRoleMapper.insertSelective(smRole);
		for (Long authId : smAuths) {
			SmRoleAuth smRoleAuth = new SmRoleAuth();
			smRoleAuth.setAuthId(authId);
			smRoleAuth.setRoleId(smRole.getRoleId());
			smRoleAuth.setId(SequenceUtil.getSeqId());
			smRoleAuthMapper.insertSelective(smRoleAuth);
		}
	}

	public void updateSmRole(SmRoleVo smRoleVo) throws Exception {
		List<Long> smAuths = smRoleVo.getSmAuths();
		SmRole smRole = new SmRole();
		BeanUtils.copyProperties(smRoleVo, smRole);
		smRoleMapper.updateByPrimaryKeySelective(smRole);
		smRoleAuthMapper.delRoleAuth(smRole.getRoleId());
		for (Long authId : smAuths) {
			SmRoleAuth smRoleAuth = new SmRoleAuth();
			smRoleAuth.setAuthId(authId);
			smRoleAuth.setRoleId(smRole.getRoleId());
			smRoleAuth.setId(SequenceUtil.getSeqId());
			smRoleAuthMapper.insertSelective(smRoleAuth);
		}
	}

	public void delSmRole(Long id) {
		smRoleMapper.deleteByPrimaryKey(id);
		smRoleAuthMapper.delRoleAuth(id);
	}

	public SmRoleVo selectSmRoleById(Long id) {
		SmRole smRole = smRoleMapper.selectByPrimaryKey(id);
		SmRoleVo smRoleVo = new SmRoleVo();
		List<SmAuthVo> findPermByRoleIds = smAuthService.findPermByRoleId(id);
		List<Long> smAuths = new ArrayList<Long>();
		BeanUtils.copyProperties(smRole, smRoleVo);
		for (SmAuthVo s : findPermByRoleIds) {
			smAuths.add(s.getAuthId());
		}
		smRoleVo.setSmAuths(smAuths);
		return smRoleVo;
	}
	
	public SmRole findSmRoleById(Long id) {
		return smRoleMapper.selectByPrimaryKey(id);
	}

	public List<SmRoleVo> findSmRoleListByPage(BaseWhere baseWhere) throws Exception {
		Page<SmRole> page = PageHelper.startPage(baseWhere.getPageNo(), baseWhere.getPageSize(), true);
		SmRoleExample smRoleExample= new SmRoleExample();
		List<SmRole> smRoleList = smRoleMapper.selectByExample(smRoleExample);
		List<SmRoleVo> result = ConvertUtil.copyTo(smRoleList, SmRoleVo.class);
		for (SmRoleVo s : result) {
			List<SmAuthVo> findPermByRoleIds = smAuthService.findPermByRoleId(s.getRoleId());
			List<Long> smAuths = new ArrayList<Long>();
			for (SmAuthVo smAuthVo : findPermByRoleIds) {
				smAuths.add(smAuthVo.getAuthId());
			}
			s.setSmAuths(smAuths);
		}
		return result;
	}

	public List<SmRole> findSmRoleList() throws Exception {
		return smRoleMapper.selectByExample(null);
	}

}
