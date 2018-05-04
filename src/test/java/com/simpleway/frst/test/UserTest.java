package com.simpleway.frst.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.controller.UserLoginController;
import com.simpleway.frst.domain.vo.UserLoginVo;
import com.simpleway.frst.response.JsonResult;

@WebAppConfiguration
public class UserTest extends  BaseTest{
	@Resource
	UserLoginController userLoginController;
	@Test
    public void addTest() throws Exception{
		UserLoginVo u = new UserLoginVo();
		List<Long> smRoles = new ArrayList<Long>();
		smRoles.add(1l);
		smRoles.add(2l);
        u.setSmRoles(smRoles);
        u.setLoginCode("huangfan6");
        u.setLoginPwd("huangfan");
        u.setInstitutionId(1l);
        u.setInstitutionType(5);
        u.setType(1);
        u.setState(1);
        JsonResult result = userLoginController.insertSmUser(u);
        System.out.println(JSON.toJSONString(result));
    }
	
	@Test
	public void findTessafsafat() throws Exception{
        JsonResult result = userLoginController.findUserLoginById(1507960949380359l);
        System.out.println(JSON.toJSONString(result));
    }
	
	
	@Test
    public void updateTest() throws Exception{
		UserLoginVo u = new UserLoginVo();
		List<Long> smRoles = new ArrayList<Long>();
		smRoles.add(1l);
		smRoles.add(2l);
        u.setSmRoles(smRoles);
        u.setLoginCode("huangfan1");
        u.setInstitutionType(51);
        u.setLoginId(1507960208404013l);
        JsonResult result = userLoginController.updateUserLogin(u);
        System.out.println(JSON.toJSONString(result));
    }
	
	
	@Test
    public void delTest() throws Exception{
        JsonResult result = userLoginController.delUserLogin((1507960208404013l));
        System.out.println(JSON.toJSONString(result));
    }
	
	
	@Test
    public void findSmUserListByPageTest() throws Exception{
        BaseWhere baseWhere = new BaseWhere();
        JsonResult result = userLoginController.findUserLoginListByPage(baseWhere);
        System.out.println(JSON.toJSONString(result));
    }
	
	

}
