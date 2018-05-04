package com.simpleway.frst.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.dto.SmUser;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.domain.vo.SmAuthVo;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.SmAuthService;
import com.simpleway.frst.shiro.FilterChainDefinitionsService;
import com.yuntu.commons.web.WebResponse;

@RestController
@RequestMapping("/frst/auth")
public class SmAuthController {
	@Autowired
	FilterChainDefinitionsService filterChainDefinitionsService;

	@Autowired
	SmAuthService smAuthService;
	

	@RequestMapping("/insertSmAuth")
	public JsonResult insertSmAuth(SmAuthVo smAuthVo) throws Exception {
		smAuthService.insertSmAuth(smAuthVo);
		filterChainDefinitionsService.updatePermission();
		return new JsonResult(true);
	}

	@RequestMapping("/updateSmAuth")
	public JsonResult updateSmAuth(SmAuthVo smAuthVo) throws Exception {
		smAuthService.updateSmAuth(smAuthVo);
		filterChainDefinitionsService.updatePermission();
		return new JsonResult(true);
	}

	@RequestMapping("/delSmAuth")
	public JsonResult delSmAuth(Long authId) throws Exception {
		smAuthService.delSmAuth(authId);
		filterChainDefinitionsService.updatePermission();
		return new JsonResult(true);
	}

	/**
	 * 分页查询
	 * @param baseWhere
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSmAuthListByPage")
	public JsonResult findSmAuthListByPage(BaseWhere baseWhere) throws Exception {
		return new JsonResult(true,smAuthService.findSmAuthList(baseWhere));
	}

	/**
	 * 角色的对应的权限
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findPermByRoleId")
	public JsonResult findPermByRoleId(Long roleId) throws Exception {
		return new JsonResult(true,smAuthService.findPermByRoleId(roleId));
	}

//	@RequestMapping("/findSmAuthList")
//	public WebResponse findSmAuthList() {
//		WebResponse wrp = new WebResponse();
//		wrp.setData(smAuthService.findSmAuthList());
//		return wrp;
//	}

	/**
	 * 获取当前菜单下的按钮权限
	 * @param session
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findMenuButtonPermById")
	public JsonResult findMenuButtonPermById(HttpSession session,Long parentId) throws Exception {
//		SmUser smUser = (SmUser) session.getAttribute(BaseConstant.SESSION_USER);
		return new JsonResult(true,smAuthService.findMenuButtonPermById(parentId));
	}

	/**
	 * 获取所有菜单列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSmAuthMenuList")
	public JsonResult findSmAuthMenuList() throws Exception {
		return new JsonResult(true,smAuthService.findSmAuthMenuList(-1l,new ArrayList<SmAuthVo>()));
	}
	
	/**
	 * 获取所有菜单列表（不分级）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSmAuthMenuListHierarchy")
	public JsonResult findSmAuthMenuListHierarchy() throws Exception {
		return new JsonResult(true,smAuthService.findSmAuthMenuListHierarchy());
	}

	/**
	 * 获取当前用户的菜单
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSmAuthMenuListByUserId")
	public JsonResult findSmAuthMenuListByUserId(HttpSession session) throws Exception {
		UserLogin userLogin = (UserLogin) session.getAttribute(BaseConstant.SESSION_USER);
		return new JsonResult(true,smAuthService.findSmAuthMenuListByUserId(userLogin.getLoginId(), userLogin.getType()));

	}

	
	/**
	 * 获取所有的权限列表(菜单、按钮)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findFoldSmAuthList")
	public JsonResult findFoldSmAuthList() throws Exception {
		return new JsonResult(true,smAuthService.findFoldSmAuthList());

	}
	
	
	@RequestMapping("/findSmAuthById")
	public JsonResult findSmAuthById(Long authId) throws Exception {
		return new JsonResult(true,smAuthService.findSmAuthById(authId));

	}


}
