package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.BankFlowDetail;
import com.simpleway.frst.domain.dto.BankFlowDetailExample;
import com.simpleway.frst.mapper.BankFlowDetailMapper;
import com.simpleway.frst.request.bank.BankFlowForm;
import com.simpleway.frst.request.bank.BankFlowQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title BankFlowService
 * @date 2017/10/2 12:46
 * @since v1.0.0
 */
@Service
public class BankFlowService {

	@Resource
	BankFlowDetailMapper bankFlowDetailMapper;

	public Boolean addBankFlow(BankFlowForm bankFlowForm) throws Exception {
		BankFlowDetail flow = new BankFlowDetail();
		BeanUtils.copyProperties(flow, bankFlowForm);
		flow.setId(SequenceUtil.getSeqId());
		int result = bankFlowDetailMapper.insert(flow);
		return result > 0;
	}

	public Page getBankFlow(BankFlowQuery query) {
		Page<BankFlowDetail> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
		BankFlowDetailExample example = new BankFlowDetailExample();
		example.setOrderByClause("transaction_date desc");
		BankFlowDetailExample.Criteria c = example.createCriteria();
		if (query.getOutIn() != null) {
			c.andOutInEqualTo(query.getOutIn());
		}
		bankFlowDetailMapper.selectByExample(example);
		return page;
	}

	public List<BankFlowDetail> fundFlow() {
		return bankFlowDetailMapper.fundFlow();
	}
	
	public List<Map<String,Object>> fundAreaAmount(String tradeAccount) {
		return bankFlowDetailMapper.fundAreaAmount(tradeAccount);
	}
	

}
