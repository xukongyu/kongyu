package com.huarui.zls.service;

import com.huarui.zls.pojo.SyArea;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:17 2019/4/3
 * @ Description:
 */
public interface SysAreaService {
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
