package com.simpleway.frst.schedule;

import com.simpleway.frst.domain.dto.SmConstValue;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.mapper.BankFlowDetailMapper;
import com.simpleway.frst.mapper.WarnInfoMapper;
import com.simpleway.frst.service.ConstService;
import com.simpleway.frst.util.DateStyle;
import com.simpleway.frst.util.DateUtils;
import org.apache.commons.collections.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title BaseSchedule
 * @date 2017/10/1 16:53
 * @since v1.0.0
 */
public class BaseSchedule {
    protected static String warnDescTemplate = "%s，时间：【%s】，描述【%s】";

    protected static String warnType_finance = "融资矩阵预警";
    protected static String warnType_back = "还贷预警";
    protected static String warnType_other = "其他预警";

    @Resource
    WarnInfoMapper warnInfoMapper;
    @Resource
    BankFlowDetailMapper bankFlowDetailMapper;

    @Resource
    ConstService constService;

    protected void addWarnInfo(WarnInfo record) {
        warnInfoMapper.insertSelective(record);
    }


    protected String getUniqueConstValuesByCode(String code){
        List<SmConstValue> values = constService.getConstValuesByCode(code);
        if(CollectionUtils.isNotEmpty(values)){
            return values.get(0).getConstValue();
        }
        return null;
    }

    /**
     * 昨天开始时间
     *
     * @return
     */
    protected Date getYesterdayStart() {
        Date currTime = new Date();
        Date currDayStart = DateUtils.StringToDate(DateUtils.DateToString(currTime, DateStyle.YYYY_MM_DD) + " 00:00:00", DateStyle.YYYY_MM_DD_HH_MM_SS);
        return DateUtils.addDay(currDayStart, -1);
    }


    /**
     * 昨天结束时间
     *
     * @return
     */
    protected Date getYesterdayEnd() {
        Date currTime = new Date();
        Date currDayStart = DateUtils.StringToDate(DateUtils.DateToString(currTime, DateStyle.YYYY_MM_DD) + " 00:00:00", DateStyle.YYYY_MM_DD_HH_MM_SS);
        return currDayStart;
    }


    /**
     * 上个月开始时间
     *
     * @return
     */
    protected Date getLastMonthStart() {
        Date currTime = new Date();
        Date currMonthStart = DateUtils.StringToDate(DateUtils.DateToString(currTime, DateStyle.YYYY_MM) + "-01 00:00:00", DateStyle.YYYY_MM_DD_HH_MM_SS);
        return DateUtils.addMonth(currMonthStart, -1);
    }


    /**
     * 上个月结束时间
     *
     * @return
     */
    protected Date getLastMonthEnd() {
        Date currTime = new Date();
        Date currMonthStart = DateUtils.StringToDate(DateUtils.DateToString(currTime, DateStyle.YYYY_MM) + "-01 00:00:00", DateStyle.YYYY_MM_DD_HH_MM_SS);
        return currMonthStart;
    }
}
