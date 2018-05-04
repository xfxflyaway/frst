package com.simpleway.frst.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpleway.frst.domain.dto.FundFlow;
import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.domain.dto.SmAreaExample;
import com.simpleway.frst.domain.vo.FundFlowVo;
import com.simpleway.frst.mapper.FundFlowMapper;
import com.simpleway.frst.mapper.SmAreaMapper;

@Service
@Transactional
public class FundFlowService {
	@Autowired
	FundFlowMapper fundFlowMapper;
	@Autowired
	SmAreaMapper smAreaMapper;

	public void batchInsert(List<FundFlow> list) {
		fundFlowMapper.batchInsert(list);
	}
	
	public List<FundFlowVo> selectFundFlowByDay(String date) {
		List<FundFlow> list =  fundFlowMapper.selectFundFlowByDay(date);
		List<FundFlowVo> result = new ArrayList<FundFlowVo>();
		List<SmArea> selectByExample = smAreaMapper.selectByExample(new SmAreaExample());
		Map<Long,SmArea> map = new HashMap<Long,SmArea>();
		for(SmArea s: selectByExample){
			map.put(s.getAreaId(), s);
		}
		for(FundFlow f:list){
			FundFlowVo fv = new FundFlowVo();
			BeanUtils.copyProperties(f, fv);
			SmArea  inflowArea = map.get(f.getInflowAreaId());
			SmArea outflowArea = map.get(f.getOutflowAreaId());
			if(inflowArea!=null){
				fv.setInflowAreaName(inflowArea.getAreaName());
				fv.setOutflowAreaName(outflowArea.getAreaName());
			}
			result.add(fv);
		}
		return result;
	}

	public List<Map<String,Object>> investCount(String date) {
		return fundFlowMapper.investCount(date);
	}
	
	public List<Map<String,Object>> investCapital(String date) {
		return fundFlowMapper.investCapital(date);
	}
}
