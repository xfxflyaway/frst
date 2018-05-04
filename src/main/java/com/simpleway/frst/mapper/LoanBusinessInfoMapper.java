package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.LoanBusinessInfo;
import com.simpleway.frst.domain.dto.LoanBusinessInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LoanBusinessInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoanBusinessInfo record);

    int insertSelective(LoanBusinessInfo record);

    List<LoanBusinessInfo> selectByExample(LoanBusinessInfoExample example);

    LoanBusinessInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoanBusinessInfo record);

    int updateByPrimaryKey(LoanBusinessInfo record);

    LoanBusinessInfo getByLoanAccountNo(@Param("loanAccountNo") String loanAccountNo);

	List<LoanBusinessInfo> loanTotalInfo();
	
	List<Map<String, Object>> loanCount(@Param("date") String date);
	
	List<Map<String, Object>> loanCapital(@Param("date") String date);

    int getLoanBusinessTotalCount();
}