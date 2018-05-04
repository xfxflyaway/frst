package com.simpleway.frst.request.company;

import com.simpleway.frst.request.base.BaseWhereReq;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title LoanCompanyFinanceQuery
 * @date 2017/9/30 11:21
 * @since v1.0.0
 */
public class LoanCompanyFinanceQuery extends BaseWhereReq {

    /**
     * 公司名
     */
    private String companyName;
    /**
     * 付款方名称
     */
    private String payName;
    /**
     * 融资矩阵项目编号
     */
    private String financeProject;
    /**
     * 融资接收账号
     */
    private String financeAccount;
    /**
     * 合作方
     */
    private String partner;
    /**
     * 融资开始时间
     */
    private Date beginTime;
    /**
     * 融资结束时间
     */
    private Date endTime;
    /**
     * 批准额度
     */
    private BigDecimal approvalAmount;
    /**
     * 剩余额度
     */
    private BigDecimal residualAmount;

    private Integer state;

    private Integer compState;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getFinanceProject() {
        return financeProject;
    }

    public void setFinanceProject(String financeProject) {
        this.financeProject = financeProject;
    }

    public String getFinanceAccount() {
        return financeAccount;
    }

    public void setFinanceAccount(String financeAccount) {
        this.financeAccount = financeAccount;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
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
