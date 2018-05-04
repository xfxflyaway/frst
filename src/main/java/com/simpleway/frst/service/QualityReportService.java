package com.simpleway.frst.service;

import com.google.common.collect.Lists;
import com.simpleway.frst.domain.dto.QualityReport;
import com.simpleway.frst.domain.dto.QualityReportExample;
import com.simpleway.frst.mapper.QualityReportMapper;
import com.simpleway.frst.request.qualityreport.QualityReportQuery;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title QualityReportService
 * @date 2017/10/29 14:35
 * @since v1.0.0
 */
@Service
public class QualityReportService {

    @Resource
    QualityReportMapper qualityReportMapper;

    public List listByCondition(QualityReportQuery query) {

        QualityReportExample example = new QualityReportExample();
        QualityReportExample.Criteria c = example.createCriteria();
        if (query.getRadio() != null) {
            c.andRadioEqualTo(query.getRadio());
        }
        if (query.getReportType() != null) {
            c.andReportTypeEqualTo(query.getReportType());
        }
        if (query.getCreateTimeEnd() != null) {
            c.andCreateTimeLessThanOrEqualTo(query.getCreateTimeEnd());
        }
        if (query.getCreateTimeStart() != null) {
            c.andCreateTimeGreaterThanOrEqualTo(query.getCreateTimeStart());
        }

        List<QualityReport> result = qualityReportMapper.selectByExample(example);
        return CollectionUtils.isNotEmpty(result) ? result : Lists.newArrayList();
    }
}
