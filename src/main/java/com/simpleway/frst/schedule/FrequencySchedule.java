package com.simpleway.frst.schedule;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.BankFlowDetail;
import com.simpleway.frst.domain.dto.BankFlowDetailExample;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.dto.LoanCompanyInfoExample;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.mapper.LoanCompanyInfoMapper;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 入账频次告警
 * 同一个账号在一个月出现的频次大于设置的频次（record_freq），则预警
 *
 * @author xiongfeixiang
 * @title FrequencySchedule
 * @date 2017/10/3 13:03
 * @since v1.0.0
 */
@EnableScheduling
@Configuration
public class FrequencySchedule extends BaseSchedule {
    private static Logger logger = LoggerFactory.getLogger(FrequencySchedule.class);

    @Resource
    LoanCompanyInfoMapper loanCompanyInfoMapper;

    /**
     * 入账频次告警
     */
//    @Scheduled(fixedRate = 5 * 1000)
    @Scheduled(cron = "59 59 23 * * ? ")
    public void schedule() {
        logger.info("入账频次告警检查开始");
        check();
        logger.info("入账频次告警检查结束");
    }

    private void check() {
        BankFlowDetailExample example = new BankFlowDetailExample();
        example.createCriteria()
                .andTransactionDateBetween(getLastMonthStart(), getLastMonthEnd())
                .andOutInEqualTo("汇入");
        // 昨天的交易数据
        List<BankFlowDetail> list = bankFlowDetailMapper.selectByExample(example);

        //根据对方账号分组
        Map<String, List<BankFlowDetail>> map = list
                .stream()
                .collect(Collectors.groupingBy(BankFlowDetail::getCounterAccountNo));
        for (String key : map.keySet()) {
            doFrequencyWarn(key, map.get(key));
        }
    }

    private void doFrequencyWarn(String counterAccountNo, List<BankFlowDetail> list) {
        String valueStr = getUniqueConstValuesByCode(BaseConstant.RECORDFREQ);
        if (StringUtils.isBlank(valueStr)) {
            logger.warn("阈值【一个月出现的频次】不存在或为空");
            return;
        }
        int freq = Integer.parseInt(valueStr);
        //再次根据交易账户名称分组，用于区分公司
        Map<String, List<BankFlowDetail>> map = list
                .stream()
                .collect(Collectors.groupingBy(BankFlowDetail::getTradeAccountName));
        for (String tradeAccountName : map.keySet()) {

            LoanCompanyInfoExample example = new LoanCompanyInfoExample();
            example.createCriteria()
                    .andCompanyNameEqualTo(tradeAccountName);
            List<LoanCompanyInfo> companyInfos = loanCompanyInfoMapper.selectByExample(example);
            if (companyInfos.size() != 1) {
                logger.warn("根据公司名称查询出的公司有0个或多个，公司名称：" + tradeAccountName + "，请核查！");
                break;
            }
            LoanCompanyInfo info = companyInfos.get(0);

            DoubleSummaryStatistics statistics = map.get(tradeAccountName)
                    .stream()
                    .mapToDouble(value -> value.getTransctionAmount().doubleValue()).summaryStatistics();

            if (list.size() > freq) {
                WarnInfo warn = new WarnInfo();
                warn.setWarnId(SequenceUtil.getSeqId());
                warn.setCompanyId(info.getCompanyId());
                warn.setCompanyName(info.getCompanyName());
                warn.setWarnAmount(new BigDecimal(statistics.getSum()));
                warn.setWarnBusiId(info.getCompanyId());
                warn.setWarnTime(new Date());
                //1：还贷预警  2：融资矩阵预警,3其他预警
                warn.setWarnType(3);
                String desc = warnType_other
                        + " 账户【" + counterAccountNo + "】"
                        + "月入账频次【" + list.size() + "】大于该公司【" + tradeAccountName + "】注册资金设置频次【" + freq + "】";
                warn.setWarnDesc(desc);
                addWarnInfo(warn);
            }
        }
    }
}
