package com.huarui.zls.mapper;

import com.huarui.zls.pojo.BeFormula;

public interface BeFormulaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeFormula record);

    int insertSelective(BeFormula record);

    BeFormula selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeFormula record);

    int updateByPrimaryKey(BeFormula record);
}