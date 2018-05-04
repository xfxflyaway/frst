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
import java.util.List;

/**
 * 金额告警
 * 比对金额大小：单笔汇入金额（银行明细表统计）大于该公司注册资金设置的金额倍数（amount_multi），则预警
 *
 * @author xiongfeixiang
 * @title AmountSchedule
 * @date 2017/10/3 12:58
 * @since v1.0.0
 */
@EnableScheduling
@Configuration
public class AmountSchedule extends BaseSchedule {
    private static Logger logger = LoggerFactory.getLogger(AmountSchedule.class);

    @Resource
    LoanCompanyInfoMapper loanCompanyInfoMapper;

    /**
     * 金额告警
     */
//    @Scheduled(fixedRate = 5 * 1000)
    @Scheduled(cron = "59 59 23 * * ? ")
    public void schedule() {
        logger.info("金额告警检查开始");
        check();
        logger.info("金额告警检查结束");
    }

    private void check() {
        Date yesterdayStart = getYesterdayStart();
        Date yesterdayEnd = getYesterdayEnd();
        BankFlowDetailExample example = new BankFlowDetailExample();
        example.createCriteria()
                .andTransactionDateBetween(yesterdayStart, yesterdayEnd)
                .andOutInEqualTo("汇入");
        // 昨天的交易数据
        List<BankFlowDetail> list = bankFlowDetailMapper.selectByExample(example);
        list.forEach(flow -> doAmountWarn(flow));

    }

    private void doAmountWarn(BankFlowDetail flow) {
        LoanCompanyInfoExample example = new LoanCompanyInfoExample();
        example.createCriteria()
                .andCompanyNameEqualTo(flow.getTradeAccountName());

        List<LoanCompanyInfo> companyInfos = loanCompanyInfoMapper.selectByExample(example);
        if (companyInfos.size() != 1) {
            logger.warn("根据公司名称查询出的公司有0个或多个，公司名称：" + flow.getTradeAccountName() + "，请核查！");
            return;
        }
        String valueStr = getUniqueConstValuesByCode(BaseConstant.AMOUNTMULTI);
        if (StringUtils.isBlank(valueStr)) {
            logger.warn("阈值【注册资金设置的金额倍数】不存在或为空");
            return;
        }
        int amountMulti = Integer.parseInt(valueStr);

        LoanCompanyInfo info = companyInfos.get(0);
        // 倍数金额
        BigDecimal mutiAmount = new BigDecimal(info.getRegisteredCapital()).multiply(new BigDecimal(amountMulti));
        if (flow.getTransctionAmount().compareTo(mutiAmount) == 1) {
            WarnInfo warn = new WarnInfo();
            warn.setWarnId(SequenceUtil.getSeqId());
            warn.setCompanyId(info.getCompanyId());
            warn.setCompanyName(info.getCompanyName());
            warn.setWarnAmount(flow.getTransctionAmount());
            warn.setWarnBusiId(flow.getId());
            warn.setWarnTime(new Date());
            //1：还贷预警  2：融资矩阵预警,3其他预警
            warn.setWarnType(3);
            String desc = warnType_other
                    + " 公司【" + info.getCompanyName() + "】"
                    + "单笔汇入金额【" + flow.getTransctionAmount() + "】大于该公司注册资金设置的金额倍数【" + mutiAmount + "】";
            warn.setWarnDesc(desc);
            addWarnInfo(warn);
        }

    }

}