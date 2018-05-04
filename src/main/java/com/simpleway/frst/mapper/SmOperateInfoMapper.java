package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmOperateInfo;
import com.simpleway.frst.domain.dto.SmOperateInfoExample;
import java.util.List;

public interface SmOperateInfoMapper {
    int deleteByPrimaryKey(Long operateId);

    int insert(SmOperateInfo record);

    int insertSelective(SmOperateInfo record);

    List<SmOperateInfo> selectByExample(SmOperateInfoExample example);

    SmOperateInfo selectByPrimaryKey(Long operateId);

    int updateByPrimaryKeySelective(SmOperateInfo record);

    int updateByPrimaryKey(SmOperateInfo record);
}