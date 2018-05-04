package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.SmUser;
import com.simpleway.frst.domain.dto.SmUserExample;
import java.util.List;

public interface SmUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    SmUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SmUser record);

    int updateByPrimaryKey(SmUser record);
}