package com.simpleway.frst.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.base.BaseWhere;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.domain.vo.UserLoginVo;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.UserLoginService;

@RestController
@RequestMapping("/frst/user")
public class UserLoginController {

	@Autowired
	UserLoginService userLoginService;

	@RequestMapping("/findUserLoginById")
	public JsonResult findUserLoginById(Long userId) throws Exception {
		return new JsonResult(true,userLoginService.SelectUserLoginById(userId));
	}
	
	
	@RequestMapping("/insertSmUser")
	public JsonResult insertSmUser(UserLoginVo userLoginVo) throws Exception {
		JsonResult jr = new JsonResult(true);
		UserLogin userLogin = userLoginService.findUserLoginByName(userLoginVo.getLoginCode());
		if (userLogin != null) {
			jr.setFlag(false);
			jr.setCode(0);
			jr.setMsg("用户名重复");
			return jr;
		}
		userLoginService.insertUserLogin(userLoginVo);
		return jr;
	}

	@RequestMapping("/updateSmUser")
	public JsonResult updateUserLogin(UserLoginVo userLoginVo) throws Exception {
		JsonResult wrp = new JsonResult(true);
		UserLogin userLogin = userLoginService.findUserLoginByName(userLoginVo.getLoginCode());
		if (userLogin != null && userLogin.getLoginId().longValue() != userLoginVo.getLoginId().longValue()) {
			wrp.setFlag(false);
			wrp.setCode(0);
			wrp.setMsg("用户名重复");
			return wrp;
		}
		userLoginService.updateUserLogin(userLoginVo);
		return wrp;
	}

	@RequestMapping("/delSmUser")
	public JsonResult delUserLogin(Long loginId) {
		JsonResult wrp = new JsonResult(true);
		userLoginService.delUserLogin(loginId);
		return wrp;
	}

	@RequestMapping("/findSmUserListByPage")
	public JsonResult findUserLoginListByPage(BaseWhere baseWhere) throws Exception {
		JsonResult wrp = new JsonResult(true);
		wrp.setData(userLoginService.findUserLoginListByPage(baseWhere));
		return wrp;
	}

	@RequestMapping("/unlockUser")
	public JsonResult unlockUser(Long loginId) {
		userLoginService.unlockUserLogin(loginId);
		JsonResult wr = new JsonResult(true);
		return wr;
	}

	@RequestMapping("/enableUser")
	public JsonResult enableUser(Long loginId) {
		userLoginService.enableUserLogin(loginId);
		JsonResult wr = new JsonResult(true);
		return wr;
	}

	@RequestMapping("/disableUser")
	public JsonResult disableUser(Long loginId) {
		userLoginService.disableUserLogin(loginId);
		JsonResult wr = new JsonResult(true);
		return wr;
	}

	@RequestMapping("/updateUserPwd")
	public JsonResult updateUserPwd(String loginPwdOld, String loginPwd) {
		UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
		JsonResult wrp = new JsonResult(true);
		Boolean b = userLoginService.updateUserLoginPwd(userLogin.getLoginId(), loginPwdOld, loginPwd);
		if (!b) {
			wrp.setFlag(false);
			wrp.setCode(0);
			wrp.setMsg("原密码不正确");
		}
		return wrp;
	}

	@RequestMapping("/resetUserPwd")
	public JsonResult resetUserPwd(Long loginId) {
		JsonResult wrp = new JsonResult(true);
		userLoginService.resetUserLoginPwd(loginId);
		return wrp;
	}

}
