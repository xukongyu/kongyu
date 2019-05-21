package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyEmpmenupower;

import java.util.List;

//员工菜单权限设置
public interface SyEmpmenupowerMapper {

    //添加
    boolean addMenupower(SyEmpmenupower syEmpmenupower);
    //根据员工id查询;其所有权限
    List<SyEmpmenupower> getByEmpIdAll(Integer id);
    //根据员工id删除所有再进行添加
    boolean delByEmpIdAll(Integer id);
}