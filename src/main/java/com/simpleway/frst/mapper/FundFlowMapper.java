package com.simpleway.frst.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.simpleway.frst.domain.dto.FundFlow;

/**
 * @author hf
 */
public interface FundFlowMapper {
	void batchInsert(List<FundFlow> list);

	List<FundFlow> selectFundFlowByDay(@Param("date") String date);

	List<Map<String, Object>> investCount(@Param("date") String date);

	List<Map<String, Object>> investCapital(@Param("date") String date);
}
