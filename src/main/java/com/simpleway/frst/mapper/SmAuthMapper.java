package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmAuth;
import com.simpleway.frst.domain.dto.SmAuthExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmAuthMapper {
    int deleteByPrimaryKey(Long authId);

    int insert(SmAuth record);

    int insertSelective(SmAuth record);

    List<SmAuth> selectByExample(SmAuthExample example);

    SmAuth selectByPrimaryKey(Long authId);

    int updateByPrimaryKeySelective(SmAuth record);

    int updateByPrimaryKey(SmAuth record);

	List<SmAuth> findSmAuthMenuListByUserId(@Param("loginId")Long loginId, @Param("type")Integer type);

	List<SmAuth> findPermByRoleId(Long roleId);

	List<SmAuth> findSmAuthListByUserId(Long loginId);
}