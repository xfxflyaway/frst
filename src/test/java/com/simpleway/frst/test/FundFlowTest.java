package com.simpleway.frst.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.FundFlowController;
import com.simpleway.frst.response.JsonResult;

public class FundFlowTest extends BaseTest {
	@Autowired
	FundFlowController fundFlowController;

	@Test
	public void investCount() {
		JsonResult result = fundFlowController.investCount("2017-10-23");
		System.out.println(JSON.toJSONString(result));
	}

	@Test
	public void investCapital() {
		JsonResult result = fundFlowController.investCapital("2017-10-23");
		System.out.println(JSON.toJSONString(result));
	}

}
