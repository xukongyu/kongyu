package com.huarui.zls.mapper;

import com.huarui.zls.pojo.UsFormula;

public interface UsFormulaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsFormula record);

    int insertSelective(UsFormula record);

    UsFormula selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsFormula record);

    int updateByPrimaryKey(UsFormula record);
}