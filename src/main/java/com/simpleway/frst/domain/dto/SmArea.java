package com.simpleway.frst.domain.dto;

public class SmArea {
    private Long areaId;

    private String areaName;

    private Long upperAreaId;

    public SmArea(Long areaId, String areaName, Long upperAreaId) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.upperAreaId = upperAreaId;
    }

    public SmArea() {
        super();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getUpperAreaId() {
        return upperAreaId;
    }

    public void setUpperAreaId(Long upperAreaId) {
        this.upperAreaId = upperAreaId;
    }
}