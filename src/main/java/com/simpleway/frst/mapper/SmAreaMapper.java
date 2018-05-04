package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.domain.dto.SmAreaExample;
import java.util.List;

public interface SmAreaMapper {
    int deleteByPrimaryKey(Long areaId);

    int insert(SmArea record);

    int insertSelective(SmArea record);

    List<SmArea> selectByExample(SmAreaExample example);

    SmArea selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(SmArea record);

    int updateByPrimaryKey(SmArea record);
}