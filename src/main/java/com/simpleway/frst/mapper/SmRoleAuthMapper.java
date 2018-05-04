package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmRoleAuth;
import com.simpleway.frst.domain.dto.SmRoleAuthExample;
import java.util.List;

public interface SmRoleAuthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmRoleAuth record);

    int insertSelective(SmRoleAuth record);

    List<SmRoleAuth> selectByExample(SmRoleAuthExample example);

    SmRoleAuth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmRoleAuth record);

    int updateByPrimaryKey(SmRoleAuth record);

	void delRoleAuth(Long roleId);
}