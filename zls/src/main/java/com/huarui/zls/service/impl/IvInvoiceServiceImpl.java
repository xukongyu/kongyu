package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.IvInvoiceMapper;
import com.huarui.zls.pojo.IvInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IvInvoiceServiceImpl implements com.huarui.zls.service.IvInvoiceService {
    @Autowired
    private IvInvoiceMapper invoicemapper;

    @Override
    public List<IvInvoice> selectByempid(int empid){
         List<IvInvoice> list = invoicemapper.selectByempid(empid);
         return list;
    }
    public int updUsed(IvInvoice record){
        return invoicemapper.updUsed(record);
    }
}
