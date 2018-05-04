package com.simpleway.frst.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.RegisteredCapitalController;
import com.simpleway.frst.response.JsonResult;

public class RegisteredCapitalTest extends BaseTest {
	@Autowired
	RegisteredCapitalController registeredCapitalController;

	@Test
	public void registeredCapital() {
		JsonResult result = registeredCapitalController.registeredCapital();
		System.out.println(JSON.toJSONString(result));
	}
}
