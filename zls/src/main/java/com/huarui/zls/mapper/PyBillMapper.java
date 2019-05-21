package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyBill;

public interface PyBillMapper {
    int deleteByPrimaryKey(String billno);

    int insert(PyBill record);

    int insertSelective(PyBill record);

    PyBill selectByPrimaryKey(String billno);

    int updateByPrimaryKeySelective(PyBill record);

    int updateByPrimaryKey(PyBill record);
}