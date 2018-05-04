package com.simpleway.frst.domain.dto;

public class SmConstValue {
    private Long id;

    private Integer constTypeId;

    private String constValue;

    private String constDesc;

    private Integer sort;

    public SmConstValue(Long id, Integer constTypeId, String constValue, String constDesc, Integer sort) {
        this.id = id;
        this.constTypeId = constTypeId;
        this.constValue = constValue;
        this.constDesc = constDesc;
        this.sort = sort;
    }

    public SmConstValue() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConstTypeId() {
        return constTypeId;
    }

    public void setConstTypeId(Integer constTypeId) {
        this.constTypeId = constTypeId;
    }

    public String getConstValue() {
        return constValue;
    }

    public void setConstValue(String constValue) {
        this.constValue = constValue == null ? null : constValue.trim();
    }

    public String getConstDesc() {
        return constDesc;
    }

    public void setConstDesc(String constDesc) {
        this.constDesc = constDesc == null ? null : constDesc.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}