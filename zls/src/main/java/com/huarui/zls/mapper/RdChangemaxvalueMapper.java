package com.huarui.zls.mapper;

import com.huarui.zls.pojo.RdChangemaxvalue;

public interface RdChangemaxvalueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdChangemaxvalue record);

    int insertSelective(RdChangemaxvalue record);

    RdChangemaxvalue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdChangemaxvalue record);

    int updateByPrimaryKey(RdChangemaxvalue record);
}