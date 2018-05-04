package com.simpleway.frst.domain.vo;

import java.util.Date;

/**
 * @author xiongfeixiang
 * @title FinanceSupervisorVo
 * @date 2017/9/28 17:08
 * @since v1.0.0
 */
public class FinanceSupervisorVo {

    private Long id;

    /**
     * 监管人员名称
     */
    private String supervisorName;

    /**
     * 金融办id
     */
    private Long financeId;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 0无效，1有效
     */
    private Integer state;

    private Date createTime;

    private Date updateTime;

    private String financeName;

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
