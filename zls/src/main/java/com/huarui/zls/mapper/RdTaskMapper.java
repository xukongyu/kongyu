package com.huarui.zls.mapper;

import com.huarui.zls.pojo.RdTask;

public interface RdTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdTask record);

    int insertSelective(RdTask record);

    RdTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdTask record);

    int updateByPrimaryKey(RdTask record);
}