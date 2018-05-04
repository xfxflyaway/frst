package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmRole;
import com.simpleway.frst.domain.dto.SmRoleExample;
import java.util.List;

public interface SmRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SmRole record);

    int insertSelective(SmRole record);

    List<SmRole> selectByExample(SmRoleExample example);

    SmRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SmRole record);

    int updateByPrimaryKey(SmRole record);
}