package com.simpleway.frst.mapper;

import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.domain.dto.UserLoginExample;
import java.util.List;

public interface UserLoginMapper {
    int deleteByPrimaryKey(Long loginId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    List<UserLogin> selectByExample(UserLoginExample example);

    UserLogin selectByPrimaryKey(Long loginId);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);

	void unlockUserLogin(Long loginId);

	void enableUserLogin(Long loginId);

	void disableUserLogin(Long loginId);

	void updateUserLogInTimes(String userName);
}