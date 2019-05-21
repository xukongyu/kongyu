package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.PyPayMapper;
import com.huarui.zls.pojo.PyPay;
import com.huarui.zls.pojo.pypayss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PapayServiceImpl implements com.huarui.zls.service.PapayService {
    @Autowired
    private PyPayMapper pypay;
    @Override
    public int inspypay(PyPay py){

        return  pypay.insert(py);
    }
    public List<pypayss> selall(){
        return pypay.selall();
    }
    public List<pypayss> selpapayByid(String id){
        return pypay.selpapayByid(id);
    }
}
