package com.simpleway.frst.domain.dto;

import java.util.Date;

public class FinanceSupervisor {
    private Long id;

    private String supervisorName;

    private Long financeId;

    private String telephone;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    public FinanceSupervisor(Long id, String supervisorName, Long financeId, String telephone, Integer state, Date createTime, Date updateTime) {
        this.id = id;
        this.supervisorName = supervisorName;
        this.financeId = financeId;
        this.telephone = telephone;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FinanceSupervisor() {
        super();
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
        this.supervisorName = supervisorName == null ? null : supervisorName.trim();
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
        this.telephone = telephone == null ? null : telephone.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}