package com.simpleway.frst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.WarnReportService;

@Controller
@RequestMapping("/frst/warnReport")
public class WarnReportController {

	@Autowired
	WarnReportService warnReportService;

	@ResponseBody
	@RequestMapping("/selectReport")
	public JsonResult selectAll(String startTime, String endTime, String type) {
		JsonResult wb = new JsonResult(true);
		wb.setData(warnReportService.selectAll(startTime, endTime, type));
		return wb;
	}
}
