package com.simpleway.frst.domain.vo;

import java.util.Date;

/**
 * @author xiongfeixiang
 * @title LoanCompanyInfoVo
 * @date 2017/10/19 17:53
 * @since v1.0.0
 */
public class LoanCompanyInfoVo {

    private Long companyId;

    private String companyName;

    private Long areaId;

    private String areaName;

    private String registeredCapital;

    private String relaMan;

    private String relaMobile;

    private Date createTime;

    private Integer state;

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
        this.companyName = companyName;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getRelaMan() {
        return relaMan;
    }

    public void setRelaMan(String relaMan) {
        this.relaMan = relaMan;
    }

    public String getRelaMobile() {
        return relaMobile;
    }

    public void setRelaMobile(String relaMobile) {
        this.relaMobile = relaMobile;
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
