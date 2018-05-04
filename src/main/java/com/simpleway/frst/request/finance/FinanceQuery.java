package com.simpleway.frst.request.finance;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title FinacneQuery
 * @date 2017/9/28 14:48
 * @since v1.0.0
 */
public class FinanceQuery extends BaseWhereReq {
    /**
     * 金融办名称
     */
    private String financeName;
    /**
     * 金融办类型 1：市级  2：区级
     */
    private Integer financeType;
    /**
     * 区域id
     */
    private Long areaId;
    /**
     * 联系人
     */
    private String relaMan;
    /**
     * 联系电话
     */
    private String relaMobile;
    /**
     * 0.无效 1.有效
     */
    private Integer state;

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public Integer getFinanceType() {
        return financeType;
    }

    public void setFinanceType(Integer financeType) {
        this.financeType = financeType;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
