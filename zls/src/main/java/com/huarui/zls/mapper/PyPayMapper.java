package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyPay;
import com.huarui.zls.pojo.pypayss;

import java.util.List;

public interface PyPayMapper {
    int deleteByPrimaryKey(String payno);

    int insert(PyPay record);

    int insertSelective(PyPay record);

    PyPay selectByPrimaryKey(String payno);

    int updateByPrimaryKeySelective(PyPay record);

    int updateByPrimaryKey(PyPay record);
    List<pypayss> selall();
    List<pypayss> selpapayByid(String id);
}