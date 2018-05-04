package com.simpleway.frst.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.controller.SmAuthController;
import com.simpleway.frst.domain.vo.SmAuthVo;
import com.simpleway.frst.response.JsonResult;

public class AuthTest extends BaseTest {
	@Autowired
	SmAuthController smAuthController;

	@Test
	public void insertSmAuth() throws Exception {
		SmAuthVo smAuthVo = new SmAuthVo();
		smAuthVo.setAuthDesc("菜单5");
		smAuthVo.setAuthInnerCode("getddd");
		smAuthVo.setAuthName("菜单5");
		smAuthVo.setAuthOutCode("perms[getddd]");
		smAuthVo.setAuthType(1);
		smAuthVo.setAuthUrl("url");
		smAuthVo.setSort(-1);
		smAuthVo.setUpperAuthId(-1l);
		smAuthVo.setIcon("aaa");
		JsonResult result = smAuthController.insertSmAuth(smAuthVo);
		System.out.println(JSON.toJSONString(result));
	}
	
	
	@Test
	public void findSmAuth() throws Exception {
		JsonResult result = smAuthController.findSmAuthById(1507966358906444l);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void updateSmAuth() throws Exception {
		SmAuthVo smAuthVo = new SmAuthVo();
		smAuthVo.setAuthOutCode("perms[qqqq111q]");
		smAuthVo.setAuthId(1507972343088475l);
		JsonResult result = smAuthController.updateSmAuth(smAuthVo);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void delSmAuth() throws Exception {
		JsonResult result = smAuthController.delSmAuth(1507972343088475l);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void findSmAuthListByPage() throws Exception {
		BaseWhere baseWhere = new BaseWhere();
		JsonResult result = smAuthController.findSmAuthListByPage(baseWhere);
		System.out.println(JSON.toJSONString(result));
	}

	@Test    //--------------------------
	public void findPermByRoleId() throws Exception {
		JsonResult result = smAuthController.findPermByRoleId(null);
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void findSmAuthMenuList() throws Exception {
		JsonResult result = smAuthController.findSmAuthMenuList();
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void findFoldSmAuthList() throws Exception {
		JsonResult result = smAuthController.findFoldSmAuthList();
		System.out.println(JSON.toJSONString(result));
	}
}
