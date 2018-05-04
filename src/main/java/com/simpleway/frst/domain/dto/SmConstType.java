package com.simpleway.frst.domain.dto;

public class SmConstType {
    private Long constTypeId;

    private String constTypeCode;

    private String constTypeDesc;

    private Integer sort;

    public SmConstType(Long constTypeId, String constTypeCode, String constTypeDesc, Integer sort) {
        this.constTypeId = constTypeId;
        this.constTypeCode = constTypeCode;
        this.constTypeDesc = constTypeDesc;
        this.sort = sort;
    }

    public SmConstType() {
        super();
    }

    public Long getConstTypeId() {
        return constTypeId;
    }

    public void setConstTypeId(Long constTypeId) {
        this.constTypeId = constTypeId;
    }

    public String getConstTypeCode() {
        return constTypeCode;
    }

    public void setConstTypeCode(String constTypeCode) {
        this.constTypeCode = constTypeCode == null ? null : constTypeCode.trim();
    }

    public String getConstTypeDesc() {
        return constTypeDesc;
    }

    public void setConstTypeDesc(String constTypeDesc) {
        this.constTypeDesc = constTypeDesc == null ? null : constTypeDesc.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}