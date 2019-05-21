package com.huarui.zls.service;

import com.huarui.zls.pojo.IvInvoice;

import java.util.List;

public interface IvInvoiceService {
    List<IvInvoice> selectByempid(int empid);
    int updUsed(IvInvoice record);
}
