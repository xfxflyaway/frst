package com.simpleway.frst.request.company;

import javax.validation.constraints.NotNull;

/**
 * @author xiongfeixiang
 * @title LoanCompanyForm
 * @date 2017/9/29 10:05
 * @since v1.0.0
 */
public class LoanCompanyForm {


    private Long companyId;
    /**
     * 公司名
     */
    @NotNull
    private String companyName;
    /**
     * 区域ID
     */
    @NotNull
    private Long areaId;
    /**
     * 注册资本
     */
    @NotNull
    private String registeredCapital;
    /**
     * 联系人
     */
    private String relaMan;
    /**
     * 联系电话
     */
    private String relaMobile;

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
}
