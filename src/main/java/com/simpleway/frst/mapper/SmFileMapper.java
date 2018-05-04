package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmFile;
import com.simpleway.frst.domain.dto.SmFileExample;
import java.util.List;

public interface SmFileMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(SmFile record);

    int insertSelective(SmFile record);

    List<SmFile> selectByExample(SmFileExample example);

    SmFile selectByPrimaryKey(Long fileId);

    int updateByPrimaryKeySelective(SmFile record);

    int updateByPrimaryKey(SmFile record);
}