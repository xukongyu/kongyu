package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyMetertype;

import java.util.List;

//水表型号
public interface SyMetertypeMapper {
    //查询所有没有被禁用的
    List<SyMetertype> getAll();
    //修改状态为禁用 因为可能之前绑定了过多数据最好不要直接删除
    boolean updMeter(Integer id);
    //添加
    boolean addMeterType(SyMetertype syMetertype);
    //修改前单值查询
   SyMetertype getOne(int id);
   //修改
    boolean updMeterType(SyMetertype syMetertype);
}