package com.huarui.zls.mapper;

import com.huarui.zls.pojo.RdChangevalue;

public interface RdChangevalueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdChangevalue record);

    int insertSelective(RdChangevalue record);

    RdChangevalue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdChangevalue record);

    int updateByPrimaryKey(RdChangevalue record);
}