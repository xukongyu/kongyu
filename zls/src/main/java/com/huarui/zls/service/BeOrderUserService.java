package com.huarui.zls.service;

import com.huarui.zls.pojo.BeOrderuser;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:24 2019/4/11
 * @ Description:
 */
public interface BeOrderUserService {
    //根据工单id 添加工单详情 可能是多个
    boolean addOrderUser(BeOrderuser beOrderuser);
    //根据工单id查询所有所属用户
    List<BeOrderuser> getByOrderNoAll(String orderno);
    //缴费后修改属性 根据自身id
    boolean updJiaofeiYes(BeOrderuser beOrderuser);
}
