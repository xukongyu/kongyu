package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyMetertypeMapper;
import com.huarui.zls.pojo.SyMetertype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:43 2019/4/3
 * @ Description:水表型号服务实现层
 */
@Service
public class SyMeterTypeServiceImpl implements com.huarui.zls.service.SyMeterTypeService {

    @Autowired
    private SyMetertypeMapper syMetertypeMapper;

    //查询所有没有被禁用的
   @Override
   public List<SyMetertype> getAll(){
        return syMetertypeMapper.getAll();
    }
    //修改状态为禁用 因为可能之前绑定了过多数据最好不要直接删除
    public boolean updMeter(Integer id){
       return syMetertypeMapper.updMeter(id);
    }
    //添加
    public boolean addMeterType(SyMetertype syMetertype){
       return syMetertypeMapper.addMeterType(syMetertype);
    }
    //修改前单值查询
    public SyMetertype getOne(int id){
      return   syMetertypeMapper.getOne(id);
    }
    //修改
    public boolean updMeterType(SyMetertype syMetertype){
       return syMetertypeMapper.updMeterType(syMetertype);
    }
}
