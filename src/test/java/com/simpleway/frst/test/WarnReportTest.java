package com.simpleway.frst.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.WarnReportController;
import com.simpleway.frst.response.JsonResult;

public class WarnReportTest extends BaseTest{
@Autowired
WarnReportController warnReportController;
	
	@Test
	public void warnReport(){
		JsonResult selectAll = warnReportController.selectAll("2017-10-11","2017-10-17",null);
		 System.out.println(JSON.toJSONString(selectAll));
	}
}
