package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.SmOperateInfo;
import com.simpleway.frst.domain.dto.SmOperateInfoExample;
import com.simpleway.frst.mapper.SmOperateInfoMapper;
import com.simpleway.frst.request.operatelog.OperateLogQuery;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title SmOperateLogService
 * @date 2017/10/3 20:32
 * @since v1.0.0
 */
@Service
public class SmOperateLogService {

    @Resource
    SmOperateInfoMapper smOperateInfoMapper;

    public Page getSmOperateLog(OperateLogQuery query) throws Exception {

        Page<SmOperateInfo> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        SmOperateInfoExample example = new SmOperateInfoExample();
        example.setOrderByClause("update_time desc");
        SmOperateInfoExample.Criteria c = example.createCriteria();
        if (query.getActionMan() != null) {
            c.andActionManEqualTo(query.getActionMan());
        }
        if (StringUtils.isNotBlank(query.getOperateDesc())) {
            c.andOperateDescLike("%" + query.getOperateDesc() + "%");
        }
        if (null != query.getOperateType()) {
            c.andOperateTypeEqualTo(query.getOperateType());
        }
        smOperateInfoMapper.selectByExample(example);
        return page;
    }
}
