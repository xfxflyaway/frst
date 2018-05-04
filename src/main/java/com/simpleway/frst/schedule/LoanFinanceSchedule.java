package com.simpleway.frst.schedule;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.BankFlowDetail;
import com.simpleway.frst.domain.dto.BankFlowDetailExample;
import com.simpleway.frst.domain.dto.LoanCompanyFinance;
import com.simpleway.frst.domain.dto.LoanCompanyFinanceExample;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.mapper.LoanCompanyFinanceMapper;
import com.simpleway.frst.util.DateStyle;
import com.simpleway.frst.util.DateUtils;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 融资告警
 *
 * @author xiongfeixiang
 * @title WarnSchedule
 * @date 2017/9/29 11:15
 * @since v1.0.0
 */
@EnableScheduling
@Configuration
public class LoanFinanceSchedule extends BaseSchedule {
    private static Logger logger = LoggerFactory.getLogger(LoanFinanceSchedule.class);
    @Resource
    LoanCompanyFinanceMapper loanCompanyFinanceMapper;

    /**
     * 融资告警
     */
//    @Scheduled(fixedRate = 5 * 1000)
    @Scheduled(cron = "59 59 23 * * ? ")
    public void LoanCompanyFinanceWarnSchedule() {
        logger.info("融资矩阵申请检查开始");
        //1.检查所有融资,融资矩阵维度
        checkLoanCompanyFinance();
        //2.检查所有流水
        checkBankFlow();
        logger.info("融资矩阵申请检查结束");
    }

    /**
     * 银行流水校验
     */
    private void checkBankFlow() {
        logger.info("银行流水校验");
        List<BankFlowDetail> bankFlowDetails = filterBankFlow();
        bankFlowDetails.stream().forEach(flow -> doBankFlowWarnInfo(flow));
    }


    /**
     * 融资矩阵校验
     *
     * @return
     */
    private List<LoanCompanyFinance> checkLoanCompanyFinance() {
        logger.info("融资矩阵校验");

        Long currTimeStamp = System.currentTimeMillis();

        LoanCompanyFinanceExample example = new LoanCompanyFinanceExample();
        LoanCompanyFinanceExample.Criteria c = example.createCriteria();
        c.andStateEqualTo(BaseConstant.FINANCE_STATE_APPROVE_CITY);//市金融办审核通过
        c.andCompStateEqualTo(BaseConstant.COMPARE_STATE_UNDO);//未做比对

        List<LoanCompanyFinance> finances = loanCompanyFinanceMapper.selectByExample(example);
        finances.stream()
                .filter(f -> f.getEndTime().getTime() < currTimeStamp)
                .forEach(finance -> {
                    //处理告警
                    doFinanceWarnInfo(finance);
                });
        return finances;
    }

    /**
     * 处理银行流水告警
     *
     * @param flow
     */
    private void doBankFlowWarnInfo(BankFlowDetail flow) {
        LoanCompanyFinance finance = loanCompanyFinanceMapper.selectByFinanceAccount(flow.getTradeAccountNo());
        addBankFlowWarnInfo(flow, finance);

    }

    private List<BankFlowDetail> filterBankFlow() {
        LoanCompanyFinanceExample financeExample = new LoanCompanyFinanceExample();
        List<LoanCompanyFinance> finances = loanCompanyFinanceMapper.selectByExample(financeExample);

        //账户属于融资接收账户
        List<String> in = finances.stream()
                .map(LoanCompanyFinance::getFinanceAccount)
                .collect(Collectors.toList());


        BankFlowDetailExample flowExample = new BankFlowDetailExample();
        BankFlowDetailExample.Criteria c = flowExample.createCriteria();
        c.andOutInEqualTo("汇入");//汇入
        if (CollectionUtils.isNotEmpty(in)) {
            c.andTradeAccountNoIn(in);
        }

        List<BankFlowDetail> bankFlows = bankFlowDetailMapper.selectByExample(flowExample);
        return bankFlows;
    }

    /**
     * 处理融资告警
     *
     * @param finance
     */
    private void doFinanceWarnInfo(LoanCompanyFinance finance) {
        BankFlowDetailExample example = new BankFlowDetailExample();
        example.createCriteria()
                .andOutInEqualTo("汇入")//汇入
                .andTradeAccountNoEqualTo(finance.getFinanceAccount());//通过账号关联

        List<BankFlowDetail> bankFlows = bankFlowDetailMapper.selectByExample(example);
        DoubleSummaryStatistics statistics = bankFlows.parallelStream()
                .mapToDouble(flow -> flow.getTransctionAmount().doubleValue())
                .summaryStatistics();
        if (statistics.getSum() == finance.getApprovalAmount().doubleValue()) {
            //标志为对比通过
            finance.setCompState(BaseConstant.COMPARE_STATE_PASS);
            loanCompanyFinanceMapper.updateByPrimaryKey(finance);
            return;
        }
        //标志为对比告警
        finance.setCompState(BaseConstant.COMPARE_STATE_WARN);
        loanCompanyFinanceMapper.updateByPrimaryKey(finance);
        addFinanceWarnInfo(finance, statistics.getSum());
    }

    /**
     * 新增融资告警信息
     *
     * @param finance
     * @param sum
     */
    private void addFinanceWarnInfo(LoanCompanyFinance finance, Double sum) {
        Date currDate = new Date();
        WarnInfo warn = new WarnInfo();
        warn.setWarnId(SequenceUtil.getSeqId());
        warn.setCompanyId(finance.getCompanyId());
        warn.setCompanyName(finance.getCompanyName());
        warn.setWarnAmount(finance.getApprovalAmount());
        warn.setWarnBusiId(finance.getId());
        warn.setWarnTime(currDate);
        //1：还贷预警  2：融资矩阵预警
        warn.setWarnType(2);
        String desc = finance.getCompanyName() + "融资超期，审批资金：" + finance.getFinanceAccount() + "到账资金：" + sum;
        warn.setWarnDesc(String.format(warnDescTemplate, warnType_finance, DateUtils.DateToString(currDate, DateStyle.YYYY_MM_DD_HH_MM_SS), desc));

        addWarnInfo(warn);
    }

    /**
     * 新增银行流水告警信息
     *
     * @param finance
     * @param flow
     */
    private void addBankFlowWarnInfo(BankFlowDetail flow, LoanCompanyFinance finance) {
        String desTemp = "";
        if (flow.getTransactionDate().before(finance.getBeginTime())) {
            desTemp = "到账日期在融资开始之前";
        }

        if (flow.getTransactionDate().after(finance.getEndTime())) {
            desTemp = "到账日期在融资结束之后";
        }

        Date currDate = new Date();
        WarnInfo warn = new WarnInfo();
        warn.setWarnId(SequenceUtil.getSeqId());
        warn.setCompanyId(finance.getCompanyId());
        warn.setCompanyName(finance.getCompanyName());
        warn.setWarnAmount(flow.getTransctionAmount());
        warn.setWarnBusiId(flow.getId());
        warn.setWarnTime(currDate);
        //1：还贷预警  2：融资矩阵预警
        warn.setWarnType(2);
        String desc = finance.getCompanyName() + "融资告警，" + desTemp;
        warn.setWarnDesc(String.format(warnDescTemplate, warnType_finance, DateUtils.DateToString(currDate, DateStyle.YYYY_MM_DD_HH_MM_SS), desc));
        addWarnInfo(warn);
    }


}
