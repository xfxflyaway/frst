package com.simpleway.frst.request.company;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title LoanCompanyFinanceForm
 * @date 2017/9/30 11:20
 * @since v1.0.0
 */
public class LoanCompanyFinanceForm {

    private Long id;

    /**
     * 公司id
     */
//    private Long companyId;
    /**
     * 公司名
     */
//    private String companyName;
    /**
     * 付款方名称
     */
    private String payName;
    /**
     * 融资矩阵项目编号
     */
    @NotNull
    private String financeProject;
    /**
     * 融资接收账号
     */
    @NotNull
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
