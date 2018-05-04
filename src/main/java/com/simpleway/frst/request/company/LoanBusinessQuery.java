package com.simpleway.frst.request.company;

import com.simpleway.frst.request.base.BaseWhereReq;

import java.math.BigDecimal;

/**
 * @author xiongfeixiang
 * @title LoanBusinessQuery
 * @date 2017/10/1 14:58
 * @since v1.0.0
 */
public class LoanBusinessQuery extends BaseWhereReq {

    /**
     * 还款人姓名
     */
    private String loanName;
    /**
     * 还款人账号
     */
    private String loanAccountNo;
    /**
     * 还款人身份号码
     */
    private String loanIdentify;

    /**
     * 公司id
     */
    private Long companyId;

    /**
     * 每期还款金额
     */
    private BigDecimal oneAmount;
    /**
     * 状态【0放贷中，1.已完结】
     */
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    public void setLoanAccountNo(String loanAccountNo) {
        this.loanAccountNo = loanAccountNo;
    }

    public String getLoanIdentify() {
        return loanIdentify;
    }

    public void setLoanIdentify(String loanIdentify) {
        this.loanIdentify = loanIdentify;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getOneAmount() {
        return oneAmount;
    }

    public void setOneAmount(BigDecimal oneAmount) {
        this.oneAmount = oneAmount;
    }
}
