package com.huarui.zls.service;

import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.pojo.SyEmpandDept;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 20:02 2019/4/2
 * @ Description:
 */
public interface SyEmpService {
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
