package com.simpleway.frst.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.dto.SmAuth;
import com.simpleway.frst.domain.dto.SmAuthExample;
import com.simpleway.frst.domain.dto.SmAuthExample.Criteria;
import com.simpleway.frst.domain.vo.SmAreaVo;
import com.simpleway.frst.domain.vo.SmAuthVo;
import com.simpleway.frst.mapper.SmAuthMapper;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.util.ConvertUtil;
import com.simpleway.frst.util.SequenceUtil;

@Service
@Transactional
public class SmAuthService {
	@Autowired
	SmAuthMapper smAuthMapper;

	
	public SmAuth findSmAuthById(Long authId){
		return smAuthMapper.selectByPrimaryKey(authId);
	}
	public void insertSmAuth(SmAuthVo smAuthVo) throws Exception {
		SmAuth smAuth = new SmAuth();
		BeanUtils.copyProperties(smAuthVo, smAuth);
		
		if (smAuthVo.getAuthType() == 3) {
			smAuth.setAuthOutCode(smAuth.getAuthInnerCode());
		} else {
			smAuth.setAuthOutCode("perms[" + smAuth.getAuthInnerCode() + "]");
		}
		smAuth.setAuthId(SequenceUtil.getSeqId());
		smAuth.setState(1);
		smAuthMapper.insertSelective(smAuth);
	}

	public void updateSmAuth(SmAuthVo smAuthVo) throws Exception {
		SmAuth smAuth = new SmAuth();
		BeanUtils.copyProperties(smAuthVo, smAuth);
		smAuthMapper.updateByPrimaryKeySelective(smAuth);
	}

	public void delSmAuth(Long id) {
		smAuthMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 获取所有权限列  分页查
	 * 
	 * @param myPage
	 * @return
	 * @throws Exception
	 */
	public JsonPage<SmAuthVo> findSmAuthList(BaseWhere baseWhere) throws Exception {
		Page<SmAuthVo> page = PageHelper.startPage(baseWhere.getPageNo(), baseWhere.getPageSize(), true);
		List<SmAuth> smAuthList = smAuthMapper.selectByExample(null);
		JsonPage<SmAuthVo> resultList = new JsonPage<SmAuthVo>(page);
		List<SmAuthVo> result = ConvertUtil.copyTo(smAuthList, SmAuthVo.class);
		resultList.setRows(result);
		return resultList;
	}
	
	/**
	 * 启动系统时需要拦截的url
	 * @return
	 * @throws Exception
	 */
	public List<SmAuth> findSmAuthList(){
		return smAuthMapper.selectByExample(null);
	}
	

	/**
	 * 获取角色对应的权限列表
	 * 
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findPermByRoleId(Long roleId) {
		List<SmAuth> findPermByRoleId = smAuthMapper.findPermByRoleId(roleId);
		List<SmAuthVo> smAuthVoList = new ArrayList<SmAuthVo>();
		for (SmAuth smAuth : findPermByRoleId) {
			SmAuthVo smAuthVo = new SmAuthVo();
			smAuthVo.setAuthId(smAuth.getAuthId());
			smAuthVo.setAuthName(smAuth.getAuthName());
			smAuthVoList.add(smAuthVo);
		}
		return smAuthVoList;
	}

	/**
	 * 获取所有菜单列表
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findSmAuthMenuList(Long id,List<SmAuthVo> list) throws Exception {
		SmAuthExample smAuthExample = new SmAuthExample();
		smAuthExample.setOrderByClause("sort");
		Criteria createCriteria = smAuthExample.createCriteria();
		createCriteria.andAuthTypeEqualTo(1);
		createCriteria.andUpperAuthIdEqualTo(id);
		List<SmAuth> findSmAuthMenuList = smAuthMapper.selectByExample(smAuthExample);
//		 smAuthVoList = ConvertUtil.copyTo(findSmAuthMenuList, SmAuthVo.class);
		findSmAuthMenuList.stream().map(smArea -> {
			SmAuthVo vo = new SmAuthVo();
			list.add(vo);
			try {
				BeanUtils.copyProperties(smArea,vo);
				findSmAuthMenuList(smArea.getAuthId(),list);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return vo;
		}).collect(Collectors.toList());
		return list;
	}
	
	/**
	 * 获取所有菜单列表
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findSmAuthMenuListHierarchy() throws Exception {
		SmAuthExample smAuthExample = new SmAuthExample();
		smAuthExample.setOrderByClause("sort");
		Criteria createCriteria = smAuthExample.createCriteria();
		createCriteria.andAuthTypeEqualTo(1);
		List<SmAuth> findSmAuthMenuList = smAuthMapper.selectByExample(smAuthExample);
		List<SmAuthVo> smAuthVoList = ConvertUtil.copyTo(findSmAuthMenuList, SmAuthVo.class);
		return findMenuList(smAuthVoList);
	}
	
	/**
	 * 获取当前用户的菜单
	 * @param userVo
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findSmAuthMenuListByUserId(Long userId, Integer type) throws Exception {
		List<SmAuth> smAuthList = smAuthMapper.findSmAuthMenuListByUserId(userId,type);
		List<SmAuthVo> smAuthVoList = ConvertUtil.copyTo(smAuthList, SmAuthVo.class);
		return findMenuList(smAuthVoList);
	}
	
	/**
	 * 获取所有的权限列表
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findFoldSmAuthList() throws Exception {
		SmAuthExample smAuthExample = new SmAuthExample();
		smAuthExample.setOrderByClause("sort");
		List<SmAuth> smAuthList = smAuthMapper.selectByExample(smAuthExample);
//		List<SmAuth> smAuthList = smAuthService.findSmAuthList();
		List<SmAuthVo> smAuthVoList = ConvertUtil.copyTo(smAuthList, SmAuthVo.class);
		return findMenuList(smAuthVoList);
	}
	
	/**
	 * 获取当前菜单下的按钮权限
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findMenuButtonPermById(Long parentId) throws Exception {
		Subject subject = SecurityUtils.getSubject();
		SmAuthExample smAuthExample = new SmAuthExample();
		Criteria createCriteria = smAuthExample.createCriteria();
		createCriteria.andUpperAuthIdEqualTo(parentId);
		createCriteria.andAuthTypeEqualTo(2);
		List<SmAuth> menuButtonPermList = smAuthMapper.selectByExample(smAuthExample);
		List<SmAuthVo> smAuthVoList = new ArrayList<SmAuthVo>();
		for (SmAuth smAuth : menuButtonPermList) {
			SmAuthVo smAuthVo = new SmAuthVo();
			BeanUtils.copyProperties(smAuthVo, smAuth);
			smAuthVo.setFlag(subject.isPermitted(smAuth.getAuthInnerCode()));
			smAuthVoList.add(smAuthVo);
		}
		return smAuthVoList;
	}
	
	
	/**
	 * 根据传入的list递归权限列表
	 * @param permList
	 * @return
	 * @throws Exception
	 */
	public List<SmAuthVo> findMenuList(List<SmAuthVo> permList) throws Exception {
		List<SmAuthVo> firstLevelMenu = new ArrayList<SmAuthVo>();
		List<SmAuthVo> sunPerm = new ArrayList<SmAuthVo>();
		for (SmAuthVo auth : permList) {
			SmAuthVo SmAuthVo = new SmAuthVo();
			BeanUtils.copyProperties(auth,SmAuthVo);
			if (auth.getUpperAuthId() == -1) {
				firstLevelMenu.add(SmAuthVo);
			} else {
				sunPerm.add(SmAuthVo);
			}
		}
		return findSunMenu(firstLevelMenu, sunPerm);
	}

	public List<SmAuthVo> findSunMenu(List<SmAuthVo> firstLevelMenuList, List<SmAuthVo> sunPermList) {
		for (SmAuthVo firstLevelMenu : firstLevelMenuList) {
			List<SmAuthVo> permList = new ArrayList<SmAuthVo>();
			for (int i = 0; i < sunPermList.size(); i++) {
				SmAuthVo sunSmAuthVo = sunPermList.get(i);
				if (sunSmAuthVo.getUpperAuthId().longValue() == firstLevelMenu.getAuthId().longValue()) {
					permList.add(sunSmAuthVo);
					sunPermList.remove(i);
					i--;
				}
			}
			firstLevelMenu.setSunPerm(permList);
			findSunMenu(permList, sunPermList);
		}
		return firstLevelMenuList;
	}
	
	public List<SmAuth> findSmAuthListByUserId(Long userId) {
		return smAuthMapper.findSmAuthListByUserId(userId);
	}
}
