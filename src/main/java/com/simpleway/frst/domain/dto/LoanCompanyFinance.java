package com.simpleway.frst.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class LoanCompanyFinance {
    private Long id;

    private Long companyId;

    private String companyName;

    private String payName;

    private String financeProject;

    private String financeAccount;

    private String partner;

    private Date beginTime;

    private Date endTime;

    private BigDecimal approvalAmount;

    private BigDecimal residualAmount;

    private Integer state;

    private Integer compState;

    public LoanCompanyFinance(Long id, Long companyId, String companyName, String payName, String financeProject, String financeAccount, String partner, Date beginTime, Date endTime, BigDecimal approvalAmount, BigDecimal residualAmount, Integer state, Integer compState) {
        this.id = id;
        this.companyId = companyId;
        this.companyName = companyName;
        this.payName = payName;
        this.financeProject = financeProject;
        this.financeAccount = financeAccount;
        this.partner = partner;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.approvalAmount = approvalAmount;
        this.residualAmount = residualAmount;
        this.state = state;
        this.compState = compState;
    }

    public LoanCompanyFinance() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getFinanceProject() {
        return financeProject;
    }

    public void setFinanceProject(String financeProject) {
        this.financeProject = financeProject == null ? null : financeProject.trim();
    }

    public String getFinanceAccount() {
        return financeAccount;
    }

    public void setFinanceAccount(String financeAccount) {
        this.financeAccount = financeAccount == null ? null : financeAccount.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(BigDecimal approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public BigDecimal getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(BigDecimal residualAmount) {
        this.residualAmount = residualAmount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCompState() {
        return compState;
    }

    public void setCompState(Integer compState) {
        this.compState = compState;
    }
}