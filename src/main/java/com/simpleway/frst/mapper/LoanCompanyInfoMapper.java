package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.dto.LoanCompanyInfoExample;
import java.util.List;
import java.util.Map;

public interface LoanCompanyInfoMapper {
    int deleteByPrimaryKey(Long companyId);

    int insert(LoanCompanyInfo record);

    int insertSelective(LoanCompanyInfo record);

    List<LoanCompanyInfo> selectByExample(LoanCompanyInfoExample example);

    LoanCompanyInfo selectByPrimaryKey(Long companyId);

    int updateByPrimaryKeySelective(LoanCompanyInfo record);

    int updateByPrimaryKey(LoanCompanyInfo record);

	List<Map<String, Object>> registeredCapital();
}