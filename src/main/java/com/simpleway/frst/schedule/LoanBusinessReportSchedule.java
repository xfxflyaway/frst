package com.simpleway.frst.schedule;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.domain.dto.QualityReport;
import com.simpleway.frst.mapper.LoanBusinessInfoMapper;
import com.simpleway.frst.mapper.QualityReportMapper;
import com.simpleway.frst.mapper.WarnInfoMapper;
import com.simpleway.frst.util.DateStyle;
import com.simpleway.frst.util.DateUtils;
import com.simpleway.frst.util.SequenceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 贷款业务报表数据调度
 *
 * @author xiongfeixiang
 * @title LoanBusinessReportSchedule
 * @date 2017/10/38 11:52
 * @since v1.0.0
 */
@EnableScheduling
@Configuration
public class LoanBusinessReportSchedule extends BaseSchedule {
    private static Logger logger = LoggerFactory.getLogger(LoanBusinessReportSchedule.class);


    @Resource
    LoanBusinessInfoMapper loanBusinessInfoMapper;

    @Resource
    QualityReportMapper qualityReportMapper;

    @Resource
    WarnInfoMapper warnInfoMapper;

    //每天的23点开始调度，设置23点开始是因为数据量大了之后，比较费时，预留一个小时的执行时间
    @Scheduled(cron = "0 0 23 * * ? ")
//    @Scheduled(fixedRate = 1000)
    public void schedule() {
        logger.info("贷款业务报表数据调度开始，time：{}", DateUtils.DateToString(new Date(), DateStyle.YYYY_MM_DD_HH_MM_SS));
        check();
        logger.info("贷款业务报表数据调度结束,time：{}", DateUtils.DateToString(new Date(), DateStyle.YYYY_MM_DD_HH_MM_SS));
    }

    private void check() {

        //1.分组获取告警记录
        int result = warnInfoMapper.getBusinessWarnInfoCountDistinct();
        dealQuality(result);

    }

    /**
     * 处理质量报表数据
     *
     * @param count 坏账数量
     */
    private void dealQuality(int count) {

        double radio = 0.0;//按时还款比率
        int totalCount = 0;//总数量

        totalCount = loanBusinessInfoMapper.getLoanBusinessTotalCount();
            if (0 == totalCount) {
                if (count != 0) {
                    logger.warn("数据异常，count：{}，totalCount:{},", count, totalCount);
                    return;
                }
                radio = 1;
            } else {
                //1-坏账率 = 按时还款比率
                radio = 1 - count / totalCount;
            }

        QualityReport report = new QualityReport();
        report.setId(SequenceUtil.getSeqId());
        report.setRadio(radio);
        report.setCreateTime(new Date());
        int i = qualityReportMapper.insertSelective(report);
        if (i > 0) {
            logger.info("新增质量等级报表数据，i:{},report:{}", i, JSON.toJSONString(report));
        }

    }


}
