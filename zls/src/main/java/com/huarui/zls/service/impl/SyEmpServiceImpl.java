package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyEmpMapper;
import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.pojo.SyEmpandDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 20:01 2019/4/2
 * @ Description:员工服务实现层
 */
@Service
public class SyEmpServiceImpl implements com.huarui.zls.service.SyEmpService {
    @Autowired
    private SyEmpMapper syEmpMapper;
    //登录验证
    @Override
    public SyEmp getYanZhen(SyEmp emp){
       return  syEmpMapper.getYanZhen(emp);
    }
    //查询全部
    public List<SyEmpandDept> getAll(){
        return syEmpMapper.getAll();
    }
    //删除 其实就是改个状态 不是真删除
    public boolean delEmp(Integer id){
        return syEmpMapper.delEmp(id);
    }
    //添加
    public boolean addEmp(SyEmp emp){
        return syEmpMapper.addEmp(emp);
    }
    //修改前查询的那个
   public SyEmp getOne(Integer id){
        return syEmpMapper.getOne(id);
    }
    //修改
   public boolean updEmp(SyEmp emp){
        return syEmpMapper.updEmp(emp);
    }
}
