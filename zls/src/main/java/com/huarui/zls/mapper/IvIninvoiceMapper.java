package com.huarui.zls.mapper;

import com.huarui.zls.pojo.IvIninvoice;

public interface IvIninvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IvIninvoice record);

    int insertSelective(IvIninvoice record);

    IvIninvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IvIninvoice record);

    int updateByPrimaryKey(IvIninvoice record);
}