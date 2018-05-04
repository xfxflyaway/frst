package com.simpleway.frst.domain.dto;

import java.util.Date;

public class SmUser {
    private Integer userId;

    private String userName;

    private String loginCode;

    private String loginPwd;

    private Integer userType;

    private Integer roleId;

    private Integer state;

    private Date createTime;

    private String email;

    private String mobile;

    private Integer sex;

    private Integer loginTimes;

    private Date lastTime;

    public SmUser(Integer userId, String userName, String loginCode, String loginPwd, Integer userType, Integer roleId, Integer state, Date createTime, String email, String mobile, Integer sex, Integer loginTimes, Date lastTime) {
        this.userId = userId;
        this.userName = userName;
        this.loginCode = loginCode;
        this.loginPwd = loginPwd;
        this.userType = userType;
        this.roleId = roleId;
        this.state = state;
        this.createTime = createTime;
        this.email = email;
        this.mobile = mobile;
        this.sex = sex;
        this.loginTimes = loginTimes;
        this.lastTime = lastTime;
    }

    public SmUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}