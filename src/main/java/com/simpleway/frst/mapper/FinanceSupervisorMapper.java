package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.FinanceSupervisor;
import com.simpleway.frst.domain.dto.FinanceSupervisorExample;
import java.util.List;

public interface FinanceSupervisorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FinanceSupervisor record);

    int insertSelective(FinanceSupervisor record);

    List<FinanceSupervisor> selectByExample(FinanceSupervisorExample example);

    FinanceSupervisor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinanceSupervisor record);

    int updateByPrimaryKey(FinanceSupervisor record);
}