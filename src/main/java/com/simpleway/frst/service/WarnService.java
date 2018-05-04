package com.simpleway.frst.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.domain.dto.WarnInfoExample;
import com.simpleway.frst.mapper.WarnInfoMapper;
import com.simpleway.frst.request.warn.WarnQuery;

/**
 * @author xiongfeixiang
 * @title WarnService
 * @date 2017/10/2 13:30
 * @since v1.0.0
 */
@Service
public class WarnService {

    @Resource
    WarnInfoMapper warnInfoMapper;

    public Page<WarnInfo> getWarn(WarnQuery query) {

        Page<WarnInfo> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        WarnInfoExample example = new WarnInfoExample();
        example.setOrderByClause("warn_time desc");

        WarnInfoExample.Criteria c = example.createCriteria();
        if (query.getWarnType() != null) {
            c.andWarnTypeEqualTo(query.getWarnType());
        }
        if (StringUtils.isNotBlank(query.getCompanyName())) {
            c.andCompanyNameLike("%" + query.getCompanyName() + "%");
        }
        warnInfoMapper.selectByExample(example);
        return page;
    }
    
    public List<WarnInfo> warnReport() {
        return warnInfoMapper.warnReport();
    }
}
