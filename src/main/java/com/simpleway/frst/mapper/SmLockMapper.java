package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmLock;
import com.simpleway.frst.domain.dto.SmLockExample;
import java.util.List;

public interface SmLockMapper {
    int deleteByPrimaryKey(String lockId);

    int insert(SmLock record);

    int insertSelective(SmLock record);

    List<SmLock> selectByExample(SmLockExample example);

    SmLock selectByPrimaryKey(String lockId);

    int updateByPrimaryKeySelective(SmLock record);

    int updateByPrimaryKey(SmLock record);
}