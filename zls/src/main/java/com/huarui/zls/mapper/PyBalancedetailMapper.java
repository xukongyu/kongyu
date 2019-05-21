package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyBalancedetail;

public interface PyBalancedetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBalancedetail record);

    int insertSelective(PyBalancedetail record);

    PyBalancedetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBalancedetail record);

    int updateByPrimaryKey(PyBalancedetail record);
}