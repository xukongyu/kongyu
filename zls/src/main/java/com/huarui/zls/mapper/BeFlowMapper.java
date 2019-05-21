package com.huarui.zls.mapper;

import com.huarui.zls.pojo.BeFlow;

public interface BeFlowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeFlow record);

    int insertSelective(BeFlow record);

    BeFlow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeFlow record);

    int updateByPrimaryKey(BeFlow record);
}