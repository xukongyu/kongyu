package com.huarui.zls.service;

import com.huarui.zls.pojo.PyPay;
import com.huarui.zls.pojo.pypayss;

import java.util.List;

public interface PapayService {
    int inspypay(PyPay py);
    List<pypayss> selall();
    List<pypayss> selpapayByid(String id);
}
