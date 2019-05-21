package com.huarui.zls.mapper;

import com.huarui.zls.pojo.UsUser;

import java.util.List;

public interface UsUserMapper {
    int deleteByPrimaryKey(String userno);

    int insert(UsUser record);

    int insertSelective(UsUser record);

    UsUser selectByPrimaryKey(String userno);

    int updateByPrimaryKeySelective(UsUser record);

    int updateByPrimaryKey(UsUser record);

    List<UsUser> seluser(UsUser us);
    int updusermoney(UsUser ususer);
}