package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.WarnInfo;
import com.simpleway.frst.domain.dto.WarnInfoExample;

import java.util.List;

public interface WarnInfoMapper {
    int deleteByPrimaryKey(Long warnId);

    int insert(WarnInfo record);

    int insertSelective(WarnInfo record);

    List<WarnInfo> selectByExample(WarnInfoExample example);

    WarnInfo selectByPrimaryKey(Long warnId);

    int updateByPrimaryKeySelective(WarnInfo record);

    int updateByPrimaryKey(WarnInfo record);

	List<WarnInfo> warnReport();

    int getBusinessWarnInfoCountDistinct();
}