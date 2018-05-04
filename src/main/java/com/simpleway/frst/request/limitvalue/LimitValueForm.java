package com.simpleway.frst.request.limitvalue;

import javax.validation.constraints.NotNull;

/**
 * @author xiongfeixiang
 * @title LimitValueForm
 * @date 2017/10/14 11:26
 * @since v1.0.0
 */
public class LimitValueForm {

    /**
     * 注册资金设置的金额倍数
     */
    @NotNull
    private String amountMulti;

    /**
     * 在一个月出现的频次
     */
    @NotNull
    private String recordFreq;

    /**
     * 注册资金的设置倍数（account_balance_multi）
     */
    @NotNull
    private String accountBalanceMulti;

    public String getAmountMulti() {
        return amountMulti;
    }

    public void setAmountMulti(String amountMulti) {
        this.amountMulti = amountMulti;
    }

    public String getRecordFreq() {
        return recordFreq;
    }

    public void setRecordFreq(String recordFreq) {
        this.recordFreq = recordFreq;
    }

    public String getAccountBalanceMulti() {
        return accountBalanceMulti;
    }

    public void setAccountBalanceMulti(String accountBalanceMulti) {
        this.accountBalanceMulti = accountBalanceMulti;
    }
}
