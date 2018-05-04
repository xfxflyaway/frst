package com.simpleway.frst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.vo.SmRoleVo;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.SmRoleService;
import com.yuntu.commons.web.WebResponse;

@RestController
@RequestMapping("/frst/role")
public class SmRoleController {
	@Autowired
	SmRoleService smRoleService;

	@RequestMapping("/insertSmRole")
	public JsonResult insertSmRole(SmRoleVo SmRoleVo) throws Exception {
		smRoleService.insertSmRole(SmRoleVo);
		return new JsonResult(true);
		
	}

	@RequestMapping("/updateSmRole")
	public JsonResult updateSmRole(SmRoleVo SmRoleVo) throws Exception {
		smRoleService.updateSmRole(SmRoleVo);
		return new JsonResult(true);
	}

	@RequestMapping("/delSmRole")
	public JsonResult delSmRole(Long roleId) {
		smRoleService.delSmRole(roleId);
		return new JsonResult(true);
	}

	@RequestMapping("/findSmRoleListByPage")
	public JsonResult findSmRoleListByPage(BaseWhere baseWhere) throws Exception {
		return new JsonResult(true,smRoleService.findSmRoleListByPage(baseWhere));
	}

	@RequestMapping("/findSmRoleList")
	public JsonResult findSmRoleList() throws Exception {
		return new JsonResult(true,smRoleService.findSmRoleList());
	}
	
	@RequestMapping("/findSmRoleById")
	public JsonResult findSmRoleById(Long roleId) throws Exception {
		return new JsonResult(true,smRoleService.selectSmRoleById(roleId));
	}
}
