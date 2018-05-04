package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.QualityReport;
import com.simpleway.frst.domain.dto.QualityReportExample;
import java.util.List;

public interface QualityReportMapper {
    int countByExample(QualityReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QualityReport record);

    int insertSelective(QualityReport record);

    List<QualityReport> selectByExample(QualityReportExample example);

    QualityReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QualityReport record);

    int updateByPrimaryKey(QualityReport record);
}