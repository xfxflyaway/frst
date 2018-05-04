package com.simpleway.frst.eventbus.listener;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.Subscribe;
import com.simpleway.frst.eventbus.listener.events.OperateLogEvent;
import com.simpleway.frst.domain.dto.SmOperateInfo;
import com.simpleway.frst.mapper.SmOperateInfoMapper;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LogGenListener {
    private static Logger logger = LoggerFactory.getLogger(LogGenListener.class);

    @Resource
    SmOperateInfoMapper smOperateInfoMapper;

    @Subscribe
    public void addLog(OperateLogEvent event) throws Exception {
        try {
            SmOperateInfo log = new SmOperateInfo();
            BeanUtils.copyProperties(log, event);
            log.setOperateId(SequenceUtil.getSeqId());
            smOperateInfoMapper.insert(log);
            logger.info("新增业务日志，SmOperateInfo:" + JSON.toJSONString(log));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
