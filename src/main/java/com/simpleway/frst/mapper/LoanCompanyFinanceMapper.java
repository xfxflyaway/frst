package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.LoanCompanyFinance;
import com.simpleway.frst.domain.dto.LoanCompanyFinanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoanCompanyFinanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoanCompanyFinance record);

    int insertSelective(LoanCompanyFinance record);

    List<LoanCompanyFinance> selectByExample(LoanCompanyFinanceExample example);

    LoanCompanyFinance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoanCompanyFinance record);

    int updateByPrimaryKey(LoanCompanyFinance record);

    LoanCompanyFinance selectByFinanceAccount(@Param("financeAccount") String financeAccount);
}