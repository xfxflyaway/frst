package com.simpleway.frst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.RegisteredCapitalService;

@Controller
@RequestMapping("/frst/registered")
public class RegisteredCapitalController {
	@Autowired
	RegisteredCapitalService registeredCapitalService;
	
	@RequestMapping("/capital")
	@ResponseBody
	public JsonResult registeredCapital(){
		JsonResult jsonResult = new JsonResult(true);
		jsonResult.setData(registeredCapitalService.registeredCapital());
		return jsonResult;
	}

}
