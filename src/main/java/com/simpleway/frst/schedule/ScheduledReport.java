package com.simpleway.frst.schedule;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.simpleway.frst.domain.dto.FundFlow;
import com.simpleway.frst.domain.dto.LoanBusinessInfo;
import com.simpleway.frst.domain.dto.LoanTotalInfo;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.domain.dto.WarnReport;
import com.simpleway.frst.service.BankFlowService;
import com.simpleway.frst.service.FundFlowService;
import com.simpleway.frst.service.LoanBusinessService;
import com.simpleway.frst.service.LoanCompanyAccountService;
import com.simpleway.frst.service.LoanTotalInfoService;
import com.simpleway.frst.service.SmAreaService;
import com.simpleway.frst.service.WarnReportService;
import com.simpleway.frst.service.WarnService;
import com.simpleway.frst.util.SequenceUtil;

@Component
public class ScheduledReport {
	@Autowired
	WarnService warnService;
	@Autowired
	WarnReportService warnReportService;
	@Autowired
	LoanBusinessService loanBusinessService;
	@Autowired
	LoanTotalInfoService loanBusinessInfoService;
	@Autowired
	BankFlowService bankFlowService;
	@Autowired
	SmAreaService smAreaService;
	@Autowired
	LoanCompanyAccountService loanCompanyAccountService;
	@Autowired
	FundFlowService fundFlowService;
	
	@Scheduled(cron = "01 01 00 * * ? ")
	public void warnReport() {
		List<WarnReport> insert = new ArrayList<WarnReport>();
		List<WarnInfo> warnReport = warnService.warnReport();
		if (warnReport == null || warnReport.size() == 0)
			return;
		for (WarnInfo w : warnReport) {
			WarnReport wr = new WarnReport();
			wr.setId(SequenceUtil.getSeqId());
			wr.setWarnAmount(w.getWarnAmount());
			wr.setWarnCompanyId(w.getCompanyId());
			wr.setWarnType(w.getWarnType());
			wr.setCountDay(new Date());
			insert.add(wr);
		}
		warnReportService.warnReport(insert);
	}

	@Scheduled(cron = "0 0 1 1 * ?")
	public void loanTotalInfo() {
		List<LoanTotalInfo> insert = new ArrayList<LoanTotalInfo>();
		List<LoanBusinessInfo> list = loanBusinessService.loanTotalInfo();
		if (list == null || list.size() == 0)
			return;
		for (LoanBusinessInfo lbi : list) {
			LoanTotalInfo lti = new LoanTotalInfo();
			lti.setId(SequenceUtil.getSeqId());
			lti.setCompanyId(lbi.getCompanyId());
			lti.setTotalAmount(lbi.getLoanAmount());
			lti.setCountMonth(new SimpleDateFormat("yyyyMM").format(new Date()));
			insert.add(lti);
		}
		loanBusinessInfoService.loanTotalInfo(insert);
	}

	@Scheduled(cron = "01 01 00 * * ? ")
	public void fundFlow() {
		// List<BankFlowDetail> fundFlow = bankFlowService.fundFlow();
		// List<SmArea> all = smAreaService.getAll();
		// Map<Long,Object> map= new HashMap<Long, Object>();
		// for (BankFlowDetail bfd : fundFlow) {
		// Long area = 1l;
		// if(!StringUtils.isBlank(bfd.getTradeBank())){
		// area = AreaUtil.contain(all, bfd.getTradeBank());
		// }
		// Object object = map.get(area);
		// if(object==null){
		// FundFlow ff = new FundFlow();
		// map.put(area, ff);
		// }
		// FundFlow f = (FundFlow)map.get(area);
		// f.setInflowAmount(f.getInflowAmount().add(bfd.getTransctionAmount()));
		// f.setInflowAreaId(area);
		// }
		List<FundFlow> insert = new ArrayList<FundFlow>();
		List<Map<String,Object>> areaCompanyInfo = loanCompanyAccountService.getAreaCompanyInfo();
		for (Map<String,Object> map: areaCompanyInfo) {
			List<Map<String,Object>> fundAreaAmount = bankFlowService.fundAreaAmount(map.get("bank_account").toString());
			for (Map<String,Object> bfd : fundAreaAmount) {
				FundFlow f = new FundFlow();
				f.setId(SequenceUtil.getSeqId());
				f.setInflowAmount(new BigDecimal(bfd.get("transction_amount").toString()));
				f.setInflowAreaId(Long.parseLong(map.get("area_id").toString()));
				f.setInOutFlag(bfd.get("out_in").toString());
				f.setOutflowAreaId(Long.parseLong(bfd.get("area_id").toString()));
				insert.add(f);
			}
		}
		fundFlowService.batchInsert(insert);
	}

}
