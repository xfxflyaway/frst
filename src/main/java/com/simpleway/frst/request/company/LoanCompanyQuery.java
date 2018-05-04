package com.simpleway.frst.request.company;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title LoanCompanyQuery
 * @date 2017/9/29 10:32
 * @since v1.0.0
 */
public class LoanCompanyQuery extends BaseWhereReq {

    /**
     * 公司名
     */
    private String companyName;
    /**
     * 区域ID
     */
    private Long areaId;
    /**
     * 注册资本
     */
    private String registeredCapital;
    /**
     * 联系人
     */
    private String relaMan;
    /**
     * 联系电话
     */
    private String relaMobile;

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
