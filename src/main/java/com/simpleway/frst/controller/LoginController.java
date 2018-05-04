package com.simpleway.frst.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.simpleway.frst.domain.vo.UserLoginVo;
import com.simpleway.frst.service.LoanCompanyService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.SmAuthService;
import com.simpleway.frst.shiro.MyShiroRealm;

@RestController
@RequestMapping("/frst/auth")
public class LoginController {
    @Autowired
    SmAuthService smAuthService;
    @Autowired
    EhCacheManager ehCacheManager;
    @Autowired
    LoanCompanyService loanCompanyService;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    // @RequestMapping(value = "/login",method=RequestMethod.POST)
    @RequestMapping(value = "/login")
    public JsonResult login(HttpServletRequest request, String userName, String password)
            throws Exception {
        logger.info("userName:{},password {}", userName, password);
        Map<String, Object> map = new HashMap<String, Object>();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        Subject currentUser = SecurityUtils.getSubject();
        // UserLogin userLogin = (UserLogin)
        // session.getAttribute(BaseConstant.SESSION_USER);
        currentUser.login(token);
        SavedRequest savedRequest = WebUtils.getSavedRequest(request);
        if (savedRequest == null) {
            map.put("jumpPage", "/index");
        } else {
            map.put("jumpPage", savedRequest.getRequestUrl());
        }
        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        UserLoginVo userLoginVo = new UserLoginVo();
        BeanUtils.copyProperties(userLogin, userLoginVo);
        userLoginVo.setLoginPwd(null);
        userLoginVo.setSalt(null);
        userLoginVo.setCompanyName(loanCompanyService.getCompanyById(userLogin.getInstitutionId()));
        map.put("user", userLoginVo);
        map.put("menu", smAuthService.findSmAuthMenuListByUserId(userLogin.getLoginId(), userLogin.getType()));
        return new JsonResult(true, map);
    }

    @RequestMapping("/logout")
    public JsonResult logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
        }
        return new JsonResult(true);

    }

    @RequestMapping("/forwardLogin")
    public JsonResult forwardLogin() {
        JsonResult jr = new JsonResult(true);
        jr.setCode(BaseConstant.NO_LOGIN);
        jr.setMsg("未登陆");
        return jr;
    }

    @RequestMapping("/noPermission")
    public JsonResult noPermission() {
        JsonResult jr = new JsonResult(true);
        jr.setCode(BaseConstant.NO_LOGIN);
        jr.setMsg("无权限");
        return jr;
    }

}
