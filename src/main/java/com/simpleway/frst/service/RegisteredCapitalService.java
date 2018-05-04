package com.simpleway.frst.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleway.frst.mapper.LoanCompanyInfoMapper;

@Service
@Transactional
public class RegisteredCapitalService {
	@Autowired
	LoanCompanyInfoMapper loanCompanyInfoMapper;
	
	public List<Map<String,Object>> registeredCapital(){
		return loanCompanyInfoMapper.registeredCapital();
	}
}
