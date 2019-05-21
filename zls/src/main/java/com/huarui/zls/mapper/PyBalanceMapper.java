package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyBalance;

public interface PyBalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBalance record);

    int insertSelective(PyBalance record);

    PyBalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBalance record);

    int updateByPrimaryKey(PyBalance record);
}