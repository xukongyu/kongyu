package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyDept;

import java.util.List;

public interface SyDeptMapper {
    //查询全部为禁用的部门
    List<SyDept> getAll();
    //修改状态为禁用 不是真实删除
    boolean delDept(Integer id);
    //添加
    boolean addDept(SyDept syDept);
    //修改前查询
    SyDept getOne(Integer id);
    //修改
    boolean updDept(SyDept syDept);
}