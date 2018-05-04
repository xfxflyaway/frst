package com.simpleway.frst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.FundFlowService;

@Controller
@RequestMapping("/frst/fundFlow")
public class FundFlowController {
	@Autowired
	FundFlowService fundFlowService;

	@ResponseBody
	@RequestMapping("/fundFlowReport")
	public JsonResult selectFundFlowByDay(String date) {
		JsonResult wb = new JsonResult(true);
		wb.setData(fundFlowService.selectFundFlowByDay(date));
		return wb;
	}
	
	@ResponseBody
	@RequestMapping("/investCount")
	public JsonResult investCount(String date) {
		JsonResult wb = new JsonResult(true);
		wb.setData(fundFlowService.investCount(date));
		return wb;
	}
	
	
	@ResponseBody
	@RequestMapping("/investCapital")
	public JsonResult investCapital(String date) {
		JsonResult wb = new JsonResult(true);
		wb.setData(fundFlowService.investCapital(date));
		return wb;
	}
	
}
