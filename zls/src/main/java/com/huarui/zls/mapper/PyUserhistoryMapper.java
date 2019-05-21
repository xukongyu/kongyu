package com.huarui.zls.mapper;

import com.huarui.zls.pojo.PyUserhistory;

public interface PyUserhistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyUserhistory record);

    int insertSelective(PyUserhistory record);

    PyUserhistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyUserhistory record);

    int updateByPrimaryKey(PyUserhistory record);
}