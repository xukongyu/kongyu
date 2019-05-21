package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyEmpareapower;

public interface SyEmpareapowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyEmpareapower record);

    int insertSelective(SyEmpareapower record);

    SyEmpareapower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyEmpareapower record);

    int updateByPrimaryKey(SyEmpareapower record);
}