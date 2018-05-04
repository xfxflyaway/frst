package com.simpleway.frst.request.bank;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title BankFlowQuery
 * @date 2017/10/7 16:37
 * @since v1.0.0
 */
public class BankFlowQuery extends BaseWhereReq {
    private String outIn;

    public String getOutIn() {
        return outIn;
    }

    public void setOutIn(String outIn) {
        this.outIn = outIn;
    }
}
