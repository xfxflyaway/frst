package com.simpleway.frst.domain.vo;

import java.util.List;

/**
 * @author xiongfeixiang
 * @title SmAreaVo
 * @date 2017/10/3 10:00
 * @since v1.0.0
 */
public class SmAreaVo {

    private Long areaId;

    private String areaName;

    private Long upperAreaId;

    private List<SmAreaVo> child;

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
        this.areaName = areaName;
    }

    public Long getUpperAreaId() {
        return upperAreaId;
    }

    public void setUpperAreaId(Long upperAreaId) {
        this.upperAreaId = upperAreaId;
    }

    public List<SmAreaVo> getChild() {
        return child;
    }

    public void setChild(List<SmAreaVo> child) {
        this.child = child;
    }
}
