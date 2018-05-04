package com.simpleway.frst.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.domain.dto.LoanTotalInfo;
import com.simpleway.frst.service.LoanTotalInfoService;
import com.simpleway.frst.util.SequenceUtil;

public class LoanTotalInfoTest extends BaseTest{
	@Autowired
	LoanTotalInfoService loanTotalInfoService;
	
//	@Test
//	public void insert(){
//		List<LoanTotalInfo> list = new ArrayList<LoanTotalInfo>();
//		for(int i=0;i<10;i++){
//			LoanTotalInfo loanTotalInfo = new LoanTotalInfo();
//			loanTotalInfo.setId(SequenceUtil.getSeqId());
//			loanTotalInfo.setCompanyId(SequenceUtil.getSeqId());
//			loanTotalInfo.setCompanyName("11sfaf"+i);
//			loanTotalInfo.setCountMonth("2017-07");
//			loanTotalInfo.setTotalAmount(new BigDecimal(22.68*i+23.66));
//			list.add(loanTotalInfo);
//		}	
//		loanTotalInfoService.loanTotalInfo(list);
//		
//	}
	
	@Test
	public void findCity(){
		List<LoanTotalInfo> cityLoanTotalInfo = loanTotalInfoService.cityLoanTotalInfo();
		System.out.println(JSON.toJSONString(cityLoanTotalInfo));
	}
	
	@Test
	public void LoanTotal(){
		List<Map<String,Object>> cityLoanTotalInfo = loanTotalInfoService.cityLoanTotalInfoByMonth("2017-07");
		System.out.println(JSON.toJSONString(cityLoanTotalInfo));
	}
	
	@Test
	public void LoanTotalArea(){
		List<Map<String,Object>> cityLoanTotalInfo = loanTotalInfoService.cityLoanTotalInfoByArea("2017-07","万州区");
		System.out.println(JSON.toJSONString(cityLoanTotalInfo));
	}
	
	
	
}
