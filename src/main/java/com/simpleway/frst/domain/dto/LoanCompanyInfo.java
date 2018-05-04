package com.simpleway.frst.domain.dto;

import java.util.Date;

public class LoanCompanyInfo {
    private Long companyId;

    private String companyName;

    private Long areaId;

    private String registeredCapital;

    private String relaMan;

    private String relaMobile;

    private Date createTime;

    private Integer state;

    public LoanCompanyInfo(Long companyId, String companyName, Long areaId, String registeredCapital, String relaMan, String relaMobile, Date createTime, Integer state) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.areaId = areaId;
        this.registeredCapital = registeredCapital;
        this.relaMan = relaMan;
        this.relaMobile = relaMobile;
        this.createTime = createTime;
        this.state = state;
    }

    public LoanCompanyInfo() {
        super();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public String getRelaMan() {
        return relaMan;
    }

    public void setRelaMan(String relaMan) {
        this.relaMan = relaMan == null ? null : relaMan.trim();
    }

    public String getRelaMobile() {
        return relaMobile;
    }

    public void setRelaMobile(String relaMobile) {
        this.relaMobile = relaMobile == null ? null : relaMobile.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}