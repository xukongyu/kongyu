package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyCosttypeMapper;
import com.huarui.zls.pojo.SyCosttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:28 2019/4/10
 * @ Description:费用类型服务实现层
 */
@Service
public class SyCosttypeServiceImpl implements com.huarui.zls.service.SyCosttypeService {
    @Autowired
    private SyCosttypeMapper syCosttypeMapper;
    //获取所有类型为用水的
   @Override
   public List<SyCosttype> getYongShuiAll(){
        return syCosttypeMapper.getYongShuiAll();
    }
    //修改状态为禁用
    public  boolean updCost(Integer id){
       return syCosttypeMapper.updCost(id);
    }
    //添加类型
    public boolean addCost(SyCosttype costtype){
       return syCosttypeMapper.addCost(costtype);
    }
    //修改前查询
    public  SyCosttype getOne(Integer id){
       return syCosttypeMapper.getOne(id);
    }
    //修改
    public boolean updCosts(SyCosttype costtype){
        return  syCosttypeMapper.updCosts(costtype);
    }
    //获取所有附加类型
    public List<SyCosttype> getFuJiaAll(){
       return syCosttypeMapper.getFuJiaAll();
    }
    //添加附加类型
    public boolean addCostFuJia(SyCosttype costtype){
       return syCosttypeMapper.addCostFuJia(costtype);
    }
    //修改附加类型
    public boolean updCostFuJia(SyCosttype costtype){
       return syCosttypeMapper.updCostFuJia(costtype);
    }
}
