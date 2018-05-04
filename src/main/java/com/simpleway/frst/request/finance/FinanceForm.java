package com.simpleway.frst.request.finance;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title FinanceForm
 * @date 2017/9/28 13:53
 * @since v1.0.0
 */
public class FinanceForm {

    /**
     * 金融办Id 修改的时候必传
     */
    private Long financeId;
    /**
     * 金融办名称
     */
    @NotNull
    private String financeName;
    /**
     * 金融办类型 1：市级  2：区级
     */
    @NotNull
    private Integer financeType;
    /**
     * 区域id
     */
    @NotNull
    private Long areaId;
    /**
     * 联系人
     */
    private String relaMan;
    /**
     * 联系电话
     */
    private String relaMobile;

    private Date createTime;

    private Date updateTime;

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
