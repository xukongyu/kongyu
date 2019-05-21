package com.huarui.zls.service;

import com.huarui.zls.pojo.BeOrder;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:42 2019/4/11
 * @ Description:
 */
public interface BeOrderService {
    //在建业扩工单前先查询 获取当前最大的
    BeOrder getOrderNoDesc();
    //添加业扩工单
    boolean addOrder(BeOrder beOrder);
    //查询所有初审状态的工单
    List<BeOrder> selStepId(Integer id);
    //申请不通过的
    boolean shenNo(BeOrder beOrder);
    //审核通过
    boolean  shenYes(BeOrder beOrder);
    //缴费不通过
    boolean jiaofeiNo(BeOrder beOrder);
    //缴费通过
    boolean jiaoFeiYes(BeOrder beOrder);
}
