package com.simpleway.frst.schedule;

import com.simpleway.frst.domain.dto.BankFlowDetail;
import com.simpleway.frst.domain.dto.BankFlowDetailExample;
import com.simpleway.frst.domain.dto.LoanBusinessInfo;
import com.simpleway.frst.domain.dto.LoanBusinessInfoExample;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.mapper.LoanBusinessInfoMapper;
import com.simpleway.frst.mapper.LoanCompanyInfoMapper;
import com.simpleway.frst.util.DateStyle;
import com.simpleway.frst.util.DateUtils;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
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
 * 贷款业务告警
 *
 * @author xiongfeixiang
 * @title LoanBusinessSchedule
 * @date 2017/10/1 16:51
 * @since v1.0.0
 */
@EnableScheduling
@Configuration
public class LoanBusinessSchedule extends BaseSchedule {
    private static Logger logger = LoggerFactory.getLogger(LoanBusinessSchedule.class);


    @Resource
    LoanBusinessInfoMapper loanBusinessInfoMapper;

    @Resource
    LoanCompanyInfoMapper loanCompanyInfoMapper;

    /**
     * 还贷告警
     */
//    @Scheduled(fixedRate = 5 * 1000)
    @Scheduled(cron = "59 59 23 * * ? ")
    public void LoanBusinessWarnSchedule() {
        logger.info("还贷检查开始");
        check();
        logger.info("还贷检查结束");
    }

    private void check() {
        LoanBusinessInfoExample example = new LoanBusinessInfoExample();
        LoanBusinessInfoExample.Criteria c = example.createCriteria();
        // 放贷中的数据
        c.andStateEqualTo(0);
        List<LoanBusinessInfo> businessInfos = loanBusinessInfoMapper.selectByExample(example);
        //1.检测所有的放贷中的贷款
        checkLoanBusiness(businessInfos);
        //2.检查所有流水
        checkBankFlow(businessInfos);

    }

    private void checkLoanBusiness(List<LoanBusinessInfo> businessInfos) {
        businessInfos.forEach(info -> doLoanBusinessWarn(info));
    }

    private void doLoanBusinessWarn(LoanBusinessInfo info) {
        Date currDate = new Date();
        //结束还款日期
        if (currDate.after(info.getEndDate())) {
            Double sum = sumByLoanAccountNo(info);
            if (sum.doubleValue() != info.getLoanAmount().doubleValue()) {
                WarnInfo warn = new WarnInfo();
                //写告警表
                warn.setWarnId(SequenceUtil.getSeqId());
                warn.setCompanyId(info.getCompanyId());
                warn.setCompanyName(loanCompanyInfoMapper.selectByPrimaryKey(info.getCompanyId()).getCompanyName());
                warn.setWarnAmount(info.getLoanAmount());
                warn.setWarnBusiId(info.getId());
                warn.setWarnTime(currDate);
                //1：还贷预警  2：融资矩阵预警
                warn.setWarnType(1);
                String desc = new StringBuffer()
                        .append("还款总额异常，应还款:")
                        .append(info.getLoanAmount().doubleValue())
                        .append("，实际还款：")
                        .append(sum)
                        .toString();
                warn.setWarnDesc(desc);
                addWarnInfo(warn);

                //还款异常
                info.setState(3);
            } else {
                //还款完结
                info.setState(2);
            }
            loanBusinessInfoMapper.updateByPrimaryKey(info);
        }

    }

    /**
     * 根据贷款求总共的还款额
     *
     * @param info
     * @return
     */
    private Double sumByLoanAccountNo(LoanBusinessInfo info) {
        BankFlowDetailExample flowExample = new BankFlowDetailExample();
        BankFlowDetailExample.Criteria c = flowExample.createCriteria();
        c.andOutInEqualTo("汇入");//汇入
        c.andCounterAccountNoEqualTo(info.getLoanAccountNo());
        List<BankFlowDetail> bankFlows = bankFlowDetailMapper.selectByExample(flowExample);
        DoubleSummaryStatistics statistics = bankFlows.stream()
                .mapToDouble(flow -> flow.getTransctionAmount().doubleValue())
                .summaryStatistics();
        return statistics.getSum();
    }

    private void checkBankFlow(List<LoanBusinessInfo> businessInfos) {
        List<BankFlowDetail> flows = filterBankFlow(businessInfos);
        flows.forEach(flow -> doBankFlowWarn(flow));
    }

    //处理告警逻辑
    private void doBankFlowWarn(BankFlowDetail flow) {
        Date currDate = new Date();
        WarnInfo warn = new WarnInfo();
        String desc = "";

        LoanBusinessInfo businessInfo = loanBusinessInfoMapper.getByLoanAccountNo(flow.getCounterAccountNo());
        Date backTimeStart = DateUtils.StringToDate(DateUtils.getYear(currDate) + "-" + DateUtils.getMonth(currDate) + "-" + businessInfo.getReturnDay() + " 00.00.00", DateStyle.YYYY_MM_DD_HH_MM_SS);
        Date backTimeEnd = DateUtils.StringToDate(DateUtils.getYear(currDate) + "-" + DateUtils.getMonth(currDate) + "-" + businessInfo.getReturnDay() + " 23.59.59", DateStyle.YYYY_MM_DD_HH_MM_SS);
        if (flow.getTransactionDate().before(backTimeStart)) {
            desc = warnType_back + "还款提前，到账日期【" + DateUtils.DateToString(flow.getTransactionDate(), DateStyle.YYYY_MM_DD_HH_MM_SS)
                    + "】在还款最早日期【" + DateUtils.DateToString(backTimeStart, DateStyle.YYYY_MM_DD_HH_MM_SS)
                    + "】之前";
        }
        if (flow.getTransactionDate().after(backTimeEnd)) {
            desc = warnType_back + "还款延期，到账日期【" + DateUtils.DateToString(flow.getTransactionDate(), DateStyle.YYYY_MM_DD_HH_MM_SS)
                    + "】在还款截止日期【" + DateUtils.DateToString(backTimeEnd, DateStyle.YYYY_MM_DD_HH_MM_SS)
                    + "】之后";
        }

        if (flow.getTransctionAmount().doubleValue() != businessInfo.getOneAmount().doubleValue()) {
            desc = warnType_back + "金额有误，还款金额【" + flow.getTransctionAmount()
                    + "】和应还款金额【" + businessInfo.getOneAmount()
                    + "】不匹配";
        }
        if (StringUtils.isNotBlank(desc)) {
            //写告警表
            warn.setWarnId(SequenceUtil.getSeqId());
            warn.setCompanyId(businessInfo.getCompanyId());
            warn.setCompanyName(loanCompanyInfoMapper.selectByPrimaryKey(businessInfo.getCompanyId()).getCompanyName());
            warn.setWarnAmount(flow.getTransctionAmount());
            warn.setWarnBusiId(flow.getId());
            warn.setWarnTime(currDate);
            //1：还贷预警  2：融资矩阵预警
            warn.setWarnType(1);
            warn.setWarnDesc(desc);
            addWarnInfo(warn);
        }


    }

    /**
     * 过滤银行流水
     *
     * @param businessInfos
     */
    private List<BankFlowDetail> filterBankFlow(List<LoanBusinessInfo> businessInfos) {
        //贷款人银行账号 loan_account_no 做关联
        List<String> in = businessInfos.stream()
                .map(LoanBusinessInfo::getLoanAccountNo)
                .collect(Collectors.toList());

        BankFlowDetailExample flowExample = new BankFlowDetailExample();
        BankFlowDetailExample.Criteria c = flowExample.createCriteria();
        c.andOutInEqualTo("汇入");//汇入
        if (CollectionUtils.isNotEmpty(in)) {
            c.andCounterAccountNoIn(in);
        }

        List<BankFlowDetail> bankFlows = bankFlowDetailMapper.selectByExample(flowExample);
        return bankFlows;
    }


}
