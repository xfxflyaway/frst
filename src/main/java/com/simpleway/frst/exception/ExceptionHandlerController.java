package com.simpleway.frst.exception;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.response.JsonResult;
import com.yuntu.commons.web.WebResponse;
import com.yuntu.exception.Errorcode;
import com.yuntu.exception.YtException;



@RestController
@ControllerAdvice
public class ExceptionHandlerController {

	private static Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

	@ExceptionHandler(Exception.class)
	public JsonResult exceptionHandler(Exception e) {

		JsonResult br = new JsonResult(false);
		logger.error("", e);
		br.setCode(0);
		br.setMsg("inner error:"+e.getMessage());
		return br;
	}

	@ExceptionHandler(YtException.class)
	public JsonResult ytExceptionHandler(YtException e) {
		JsonResult br = new JsonResult();
		Errorcode code = e.getErrorcode();
		if (code.getCode() == YtfmUserErrors.PARAMETER_VALUE_EMPTY.getCode()) {
			br.setCode(YtfmUserErrors.PARAMETER_VALUE_EMPTY.getCode());
			br.setMsg(YtfmUserErrors.PARAMETER_VALUE_EMPTY.getDesc());
		} else if (code.getCode() == YtfmUserErrors.USER_DISABLE.getCode()) {
			br.setCode(YtfmUserErrors.USER_DISABLE.getCode());
			br.setMsg(YtfmUserErrors.USER_DISABLE.getDesc());
		}  else if (code.getCode() == YtfmUserErrors.USER_EMPTY.getCode()) {
			br.setCode(YtfmUserErrors.USER_EMPTY.getCode());
			br.setMsg(YtfmUserErrors.USER_EMPTY.getDesc());
		}  else if (code.getCode() == YtfmUserErrors.ASSIGNED_ORG_EMPTY.getCode()) {
			br.setCode(YtfmUserErrors.ASSIGNED_ORG_EMPTY.getCode());
			br.setMsg(YtfmUserErrors.ASSIGNED_ORG_EMPTY.getDesc());
		}  else if (code.getCode() == YtfmUserErrors.USER_EXIST.getCode()) {
			br.setCode(YtfmUserErrors.USER_EXIST.getCode());
			br.setMsg(YtfmUserErrors.USER_EXIST.getDesc());
		}  else if (code.getCode() == YtfmUserErrors.MAPPER_VALUE.getCode()) {
			br.setCode(YtfmUserErrors.MAPPER_VALUE.getCode());
			br.setMsg(YtfmUserErrors.MAPPER_VALUE.getDesc());
		}else {
			logger.error("not process ytexception", e);
			br.setCode(-1);
			br.setMsg("inner error");
		}

		br.setData(e.getExtraInfo());
		return br;
	}

	@ExceptionHandler(UnknownAccountException.class)
	public WebResponse unknownAccountException(UnknownAccountException e) {
		WebResponse br = new WebResponse();
		br.setCode(201);
		br.setMsg("用户名或密码错误");
		logger.error("用户名或密码错误", e);
		return br;
	}

	@ExceptionHandler(IncorrectCredentialsException.class)
	public JsonResult incorrectCredentialsException(IncorrectCredentialsException e) {
		JsonResult br = new JsonResult(false);
		br.setCode(201);
		br.setMsg("用户名或密码错误");
		logger.error("用户名或密码错误", e);
		return br;
	}

	@ExceptionHandler(AuthenticationException.class)
	public JsonResult authenticationException(AuthenticationException e) {
		JsonResult br = new JsonResult(false);
		br.setCode(201);
		br.setMsg("认证未通过");
		Throwable cause = e.getCause();
		if(cause instanceof  YtException){
			YtException y = (YtException)cause;
			br.setMsg(y.getErrorcode().getDesc());
		}
		return br;
	}
	
	@ExceptionHandler(ExcessiveAttemptsException.class)
	public JsonResult authenticationException(ExcessiveAttemptsException e) {
		JsonResult br = new JsonResult(false);
		br.setCode(202);
		br.setMsg("登录次数过多，请稍后再试");
		return br;
	}
}
