package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmUserRole;
import com.simpleway.frst.domain.dto.SmUserRoleExample;
import java.util.List;

public interface SmUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmUserRole record);

    int insertSelective(SmUserRole record);

    List<SmUserRole> selectByExample(SmUserRoleExample example);

    SmUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmUserRole record);

    int updateByPrimaryKey(SmUserRole record);

	void delUserLoginRole(Long loginId);
}