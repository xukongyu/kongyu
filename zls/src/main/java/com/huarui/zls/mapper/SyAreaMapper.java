package com.huarui.zls.mapper;

import com.huarui.zls.pojo.SyArea;

import java.util.List;

public interface SyAreaMapper {
    //查询所有
    List<SyArea> getAll();
    //禁用当前id
    boolean delArea(Integer id);
    //添加
    boolean addArea(SyArea area);
    //修改前查询
    SyArea getOne(Integer id);
    //修改
    boolean updArea(SyArea area);
}