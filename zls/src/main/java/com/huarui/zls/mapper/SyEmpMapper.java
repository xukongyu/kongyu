package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.pojo.SyEmpandDept;

import java.util.List;

//员工
public interface SyEmpMapper {
    //验证员工账号密码 同时是可用状态的
    SyEmp getYanZhen(SyEmp emp);
    //查询全部
    List<SyEmpandDept> getAll();
    //删除 其实就是改个状态 不是真删除
    boolean delEmp(Integer id);
    //添加
    boolean addEmp(SyEmp emp);
    //修改前查询的那个
    SyEmp getOne(Integer id);
    //修改
    boolean updEmp(SyEmp emp);
}