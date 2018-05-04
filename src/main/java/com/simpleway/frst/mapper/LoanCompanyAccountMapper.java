package com.simpleway.frst.mapper;

import java.util.List;
import java.util.Map;

import com.simpleway.frst.domain.dto.LoanCompanyAccount;
import com.simpleway.frst.domain.dto.LoanCompanyAccountExample;

public interface LoanCompanyAccountMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(LoanCompanyAccount record);

    int insertSelective(LoanCompanyAccount record);

    List<LoanCompanyAccount> selectByExample(LoanCompanyAccountExample example);

    LoanCompanyAccount selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(LoanCompanyAccount record);

    int updateByPrimaryKey(LoanCompanyAccount record);
    
    List<Map<String,Object>> getAreaCompanyInfo();

}