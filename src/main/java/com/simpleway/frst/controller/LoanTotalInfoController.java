package com.simpleway.frst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LoanTotalInfoService;

@Controller
@RequestMapping("/frst/loanTotalInfo")
public class LoanTotalInfoController {
	@Autowired
	LoanTotalInfoService loanTotalInfoService;

	@ResponseBody
	@RequestMapping("/cityReort")
	public JsonResult cityLoanTotalInfo() {
		JsonResult wb = new JsonResult(true);
		wb.setData(loanTotalInfoService.cityLoanTotalInfo());
		return wb;
	}
	
	@ResponseBody
	@RequestMapping("/cityLoanTotalInfoByMonth")
	public JsonResult cityLoanTotalInfoByMonth(String month) {
		JsonResult wb = new JsonResult(true);
		wb.setData(loanTotalInfoService.cityLoanTotalInfoByMonth(month));
		return wb;
	}
	
	@ResponseBody
	@RequestMapping("/cityLoanTotalInfoByArea")
	public JsonResult cityLoanTotalInfoByArea(String month, String area) {
		JsonResult wb = new JsonResult(true);
		wb.setData(loanTotalInfoService.cityLoanTotalInfoByArea(month,area));
		return wb;
	}
	
	

	@ResponseBody
	@RequestMapping("/areaReort")
	public JsonResult areaLoanTotalInfo() {
		JsonResult wb = new JsonResult(true);
		wb.setData(loanTotalInfoService.areaLoanTotalInfo());
		return wb;
	}

}
