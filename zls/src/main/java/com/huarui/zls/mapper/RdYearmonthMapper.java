package com.huarui.zls.mapper;

import com.huarui.zls.pojo.RdYearmonth;

public interface RdYearmonthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdYearmonth record);

    int insertSelective(RdYearmonth record);

    RdYearmonth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdYearmonth record);

    int updateByPrimaryKey(RdYearmonth record);
}