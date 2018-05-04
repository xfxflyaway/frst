package com.simpleway.frst.request.warn;

import com.simpleway.frst.request.base.BaseWhereReq;

/**
 * @author xiongfeixiang
 * @title WarnQuery
 * @date 2017/10/2 13:31
 * @since v1.0.0
 */
public class WarnQuery extends BaseWhereReq {

    private String companyName;
    /**
     * 1：还贷预警  2：融资矩阵预警
     */
    private Integer warnType;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }
}
