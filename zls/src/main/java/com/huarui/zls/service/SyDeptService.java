package com.huarui.zls.service;

import com.huarui.zls.pojo.SyDept;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 14:32 2019/4/4
 * @ Description:
 */
public interface SyDeptService {
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
