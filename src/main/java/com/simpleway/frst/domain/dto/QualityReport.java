package com.simpleway.frst.domain.dto;

import java.util.Date;

public class QualityReport {
    private Long id;

    private Double radio;

    private Integer reportType;

    private Date createTime;

    public QualityReport(Long id, Double radio, Integer reportType, Date createTime) {
        this.id = id;
        this.radio = radio;
        this.reportType = reportType;
        this.createTime = createTime;
    }

    public QualityReport() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}