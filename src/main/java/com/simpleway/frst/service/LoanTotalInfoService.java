package com.simpleway.frst.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleway.frst.domain.dto.LoanTotalInfo;
import com.simpleway.frst.mapper.LoanTotalInfoMapper;

@Service
@Transactional
public class LoanTotalInfoService {
	@Autowired
	LoanTotalInfoMapper loanTotalInfoMapper;

	public void loanTotalInfo(List<LoanTotalInfo> list) {
		loanTotalInfoMapper.loanTotalInfo(list);
	}

	public List<LoanTotalInfo> cityLoanTotalInfo() {
		return loanTotalInfoMapper.cityLoanTotalInfo();
	}

	public List<Map<String, Object>> cityLoanTotalInfoByMonth(String month) {
		List<Map<String, Object>> result = loanTotalInfoMapper.cityLoanTotalInfoByMonth(month);
		for (Map<String, Object> map : result) {
			map.put("month", month);
		}
		return result;
	}

	public Map areaLoanTotalInfo() {
		return loanTotalInfoMapper.areaLoanTotalInfo();

	}

	public List<Map<String, Object>> cityLoanTotalInfoByArea(String month, String area) {
		List<Map<String, Object>> result = loanTotalInfoMapper.cityLoanTotalInfoByArea(month, area);
		for (Map<String, Object> map : result) {
			map.put("month", month);
		}
		return result;
	}
}
