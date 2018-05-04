package com.simpleway.frst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simpleway.frst.domain.dto.WarnReport;

public interface WarnReportMapper {
	public void warnReport(List<WarnReport> list);

	public List<WarnReport> selectAll(@Param("startTime")String startTime, @Param("endTime")String endTime, @Param("type")String type);
	
}
