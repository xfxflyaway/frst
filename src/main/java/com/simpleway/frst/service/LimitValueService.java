package com.simpleway.frst.service;

import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.SmConstValue;
import com.simpleway.frst.request.limitvalue.LimitValueForm;
import com.simpleway.frst.util.SequenceUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiongfeixiang
 * @title LimitValueService
 * @date 2017/10/14 11:36
 * @since v1.0.0
 */
@Service
public class LimitValueService {
    @Resource
    ConstService constService;

    public Boolean addOrUpd(LimitValueForm form) {
        /**
         * 初始化的typeid数据
         */
//        1	amount_multi	注册资金设置的金额倍数	10
//        2	record_freq	在一个月出现的频次	11
//        3	account_balance_multi	注册资金的设置倍数	12
        //删除所有的配置
        constService.deleteConstValueByTypeId(1L);
        constService.deleteConstValueByTypeId(2L);
        constService.deleteConstValueByTypeId(3L);

        SmConstValue amountMultiValue = new SmConstValue(SequenceUtil.getSeqId(), 1, form.getAmountMulti(), "", 1);
        SmConstValue recordFreqValue = new SmConstValue(SequenceUtil.getSeqId(), 2, form.getRecordFreq(), "", 2);
        SmConstValue amountBalanceMultiValue = new SmConstValue(SequenceUtil.getSeqId(), 3, form.getAmountMulti(), "", 3);

        //add
        constService.addConstValue(amountMultiValue);
        constService.addConstValue(recordFreqValue);
        constService.addConstValue(amountBalanceMultiValue);
        return true;
    }

    public Map getLimitValue() {
        Map<String, List<SmConstValue>> map = new HashMap<>();
        map.put(BaseConstant.ACCOUNTBALANCEMULTI, constService.getConstValuesByCode(BaseConstant.ACCOUNTBALANCEMULTI));
        map.put(BaseConstant.AMOUNTMULTI, constService.getConstValuesByCode(BaseConstant.AMOUNTMULTI));
        map.put(BaseConstant.RECORDFREQ, constService.getConstValuesByCode(BaseConstant.RECORDFREQ));
        return map;
    }
}
