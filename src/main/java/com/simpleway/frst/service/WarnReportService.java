package com.simpleway.frst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleway.frst.domain.dto.WarnReport;
import com.simpleway.frst.mapper.WarnReportMapper;

@Service
@Transactional
public class WarnReportService {
	@Autowired
	WarnReportMapper warnReportMapper;

	public void warnReport(List<WarnReport> list) {
		warnReportMapper.warnReport(list);
	}

	public List<WarnReport> selectAll(String startTime, String endTime, String type) {
		startTime += " 00:00:00";
		endTime += " 23:59:59";
		return warnReportMapper.selectAll(startTime, endTime, type);
	}
}
