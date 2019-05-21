package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyBilldetail;

public interface PyBilldetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBilldetail record);

    int insertSelective(PyBilldetail record);

    PyBilldetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBilldetail record);

    int updateByPrimaryKey(PyBilldetail record);
}