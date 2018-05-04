package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.BankFlowDetail;
import com.simpleway.frst.domain.dto.BankFlowDetailExample;
import java.util.List;
import java.util.Map;

public interface BankFlowDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BankFlowDetail record);

    int insertSelective(BankFlowDetail record);

    List<BankFlowDetail> selectByExample(BankFlowDetailExample example);

    BankFlowDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BankFlowDetail record);

    int updateByPrimaryKey(BankFlowDetail record);

	List<BankFlowDetail> fundFlow();

	List<Map<String,Object>> fundAreaAmount(String tradeAccount);
	
}