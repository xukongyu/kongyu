package com.huarui.zls.mapper;

import com.huarui.zls.pojo.IvInvoice;

import java.util.List;

public interface IvInvoiceMapper {
    int deleteByPrimaryKey(String invoiceno);

    int insert(IvInvoice record);

    int insertSelective(IvInvoice record);

    IvInvoice selectByPrimaryKey(String invoiceno);

    int updateByPrimaryKeySelective(IvInvoice record);

    int updateByPrimaryKey(IvInvoice record);
    List<IvInvoice> selectByempid(int empid);
    int updUsed(IvInvoice record);
}