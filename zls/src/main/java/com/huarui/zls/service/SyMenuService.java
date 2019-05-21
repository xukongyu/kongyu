package com.huarui.zls.service;

import com.huarui.zls.pojo.SyMenu;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:26 2019/4/8
 * @ Description:
 */
public interface SyMenuService {
    //查询所有
    List<SyMenu> getAll();
    //根据员工id 两表联查
    List<SyMenu> getEmpidInner(Integer id);
    //根据员工id 两表联查
    List<SyMenu> getEmpidInners(Integer id);
}
