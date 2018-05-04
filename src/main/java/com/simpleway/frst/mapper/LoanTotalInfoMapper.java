package com.simpleway.frst.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.simpleway.frst.domain.dto.LoanTotalInfo;

public interface LoanTotalInfoMapper {
	public void loanTotalInfo(List<LoanTotalInfo> list);

	public List<LoanTotalInfo> cityLoanTotalInfo();

	public Map areaLoanTotalInfo();

	public List<Map<String, Object>> cityLoanTotalInfoByMonth(@Param("month") String month);

	public List<Map<String, Object>> cityLoanTotalInfoByArea(@Param("month") String month, @Param("area") String area);
}
