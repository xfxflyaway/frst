package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.FinanceInfo;
import com.simpleway.frst.domain.dto.FinanceInfoExample;
import java.util.List;

public interface FinanceInfoMapper {
    int deleteByPrimaryKey(Long financeId);

    int insert(FinanceInfo record);

    int insertSelective(FinanceInfo record);

    List<FinanceInfo> selectByExample(FinanceInfoExample example);

    FinanceInfo selectByPrimaryKey(Long financeId);

    int updateByPrimaryKeySelective(FinanceInfo record);

    int updateByPrimaryKey(FinanceInfo record);
}