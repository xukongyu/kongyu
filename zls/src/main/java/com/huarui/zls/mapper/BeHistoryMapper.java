package com.huarui.zls.mapper;

import com.huarui.zls.pojo.BeHistory;

public interface BeHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeHistory record);

    int insertSelective(BeHistory record);

    BeHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeHistory record);

    int updateByPrimaryKey(BeHistory record);
}