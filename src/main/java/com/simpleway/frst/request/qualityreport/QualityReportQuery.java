package com.simpleway.frst.request.qualityreport;

import com.simpleway.frst.request.base.BaseWhereReq;

import java.util.Date;

/**
 * @author xiongfeixiang
 * @title QualityReportQuery
 * @date 2017/10/29 14:32
 * @since v1.0.0
 */
public class QualityReportQuery extends BaseWhereReq{


    private Double radio;

    private Integer reportType;

    private Date createTimeStart;

    private Date createTimeEnd;


    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }
}
