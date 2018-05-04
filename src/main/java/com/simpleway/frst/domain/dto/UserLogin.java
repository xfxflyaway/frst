package com.simpleway.frst.domain.dto;

import java.util.Date;

public class UserLogin {
    private Long loginId;

    private String loginCode;

    private String loginPwd;

    private Integer institutionType;

    private Long institutionId;

    private Integer state;

    private Date createTime;

    private String salt;

    private Integer type;

    public UserLogin(Long loginId, String loginCode, String loginPwd, Integer institutionType, Long institutionId, Integer state, Date createTime, String salt, Integer type) {
        this.loginId = loginId;
        this.loginCode = loginCode;
        this.loginPwd = loginPwd;
        this.institutionType = institutionType;
        this.institutionId = institutionId;
        this.state = state;
        this.createTime = createTime;
        this.salt = salt;
        this.type = type;
    }

    public UserLogin() {
        super();
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
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

    public Integer getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(Integer institutionType) {
        this.institutionType = institutionType;
    }

    public Long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}