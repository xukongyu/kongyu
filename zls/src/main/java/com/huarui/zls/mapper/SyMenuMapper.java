package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyMenu;

import java.util.List;

//菜单表
public interface SyMenuMapper {
    //查询所有
    List<SyMenu> getAll();
    //根据员工id 两表联查 分组 不然出不来东西
    List<SyMenu> getEmpidInner(Integer id);
    //根据员工id 两表联查
    List<SyMenu> getEmpidInners(Integer id);
}