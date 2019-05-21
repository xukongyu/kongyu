package com.huarui.zls.mapper;

import com.huarui.zls.pojo.UsSms;

public interface UsSmsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsSms record);

    int insertSelective(UsSms record);

    UsSms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsSms record);

    int updateByPrimaryKey(UsSms record);
}