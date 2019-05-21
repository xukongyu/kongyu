package com.huarui.zls.mapper;

import com.huarui.zls.pojo.UsMeter;

public interface UsMeterMapper {
    int deleteByPrimaryKey(String meterno);

    int insert(UsMeter record);

    int insertSelective(UsMeter record);

    UsMeter selectByPrimaryKey(String meterno);

    int updateByPrimaryKeySelective(UsMeter record);

    int updateByPrimaryKey(UsMeter record);
}