package com.simpleway.frst.domain.vo;

import com.simpleway.frst.domain.dto.LoanCompanyAccount;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;

/**
 * 公司账号扩展vo
 *
 * @author xiongfeixiang
 * @title CompanyAccountAdditionalVo
 * @date 2017/10/14 10:46
 * @since v1.0.0
 */
public class CompanyAccountAdditionalVo {

    private LoanCompanyAccount account;
    private LoanCompanyInfo companyInfo;

    public LoanCompanyAccount getAccount() {
        return account;
    }

    public void setAccount(LoanCompanyAccount account) {
        this.account = account;
    }

    public LoanCompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(LoanCompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }
}
