package com.huarui.zls.service;

import com.huarui.zls.pojo.SyCosttype;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:29 2019/4/10
 * @ Description:
 */
public interface SyCosttypeService {
    //获取所有类型为用水的
    List<SyCosttype> getYongShuiAll();
    //修改状态为禁用
    boolean updCost(Integer id);
    //添加类型
    boolean addCost(SyCosttype costtype);
    //修改前查询
    SyCosttype getOne(Integer id);
    //修改
    boolean updCosts(SyCosttype costtype);
    //获取所有附加类型
    List<SyCosttype> getFuJiaAll();
    //添加附加类型
    boolean addCostFuJia(SyCosttype costtype);
    //修改附加类型
    boolean updCostFuJia(SyCosttype costtype);
}
