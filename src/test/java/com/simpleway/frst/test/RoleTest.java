package com.simpleway.frst.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.controller.SmRoleController;
import com.simpleway.frst.domain.vo.SmRoleVo;
import com.simpleway.frst.response.JsonResult;

public class RoleTest extends BaseTest{
	@Autowired
	SmRoleController smRoleController;

	@Test
	public void insertSmRoleVo() throws Exception {
		SmRoleVo  smRoleVo= new SmRoleVo();
		smRoleVo.setRoleName("2222");
		smRoleVo.setRoleCode("2222");
		smRoleVo.setRoleDesc("11111");
		List<Long> smAuths = new ArrayList<>();
		smAuths.add(1507966358906444l);
		smAuths.add(1507966379330687l);
		smAuths.add(1507966498572615l);
		smAuths.add(1507966522057300l);
		smAuths.add(1507966589540902l);
		smRoleVo.setSmAuths(smAuths);
		JsonResult result = smRoleController.insertSmRole(smRoleVo);
		System.out.println(JSON.toJSONString(result));
	}
	
	@Test
	public void findSmRoleVo() throws Exception {
		JsonResult result = smRoleController.findSmRoleById(1507969383700263l);
		System.out.println(JSON.toJSONString(result));
	}
	
	@Test
	public void updateSmRole() throws Exception {
		SmRoleVo  smRoleVo= new SmRoleVo();
		smRoleVo.setRoleName("c2221112");
		List<Long> smAuths = new ArrayList<>();
		smAuths.add(1507966358906444l);
		smAuths.add(1507966379330687l);
		smAuths.add(1507966498572615l);
		smAuths.add(1507966522057300l);
		smAuths.add(1507966589540902l);
		smRoleVo.setSmAuths(smAuths);
		smRoleVo.setRoleId(1507969383700263l);
		JsonResult result = smRoleController.updateSmRole(smRoleVo);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void delSmRole() throws Exception {
		JsonResult result = smRoleController.delSmRole(1507969277784406l);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void findSmRoleListByPage() throws Exception {
		BaseWhere baseWhere = new BaseWhere();
		JsonResult result = smRoleController.findSmRoleListByPage(baseWhere);
		System.out.println(JSON.toJSONString(result));
	}
	
	@Test
	public void findSmRoleList() throws Exception {
		JsonResult result = smRoleController.findSmRoleList();
		System.out.println(JSON.toJSONString(result));
	}
	
}
