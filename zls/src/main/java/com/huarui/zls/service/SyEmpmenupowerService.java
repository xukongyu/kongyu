package com.huarui.zls.service;

import com.huarui.zls.pojo.SyEmpmenupower;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:10 2019/4/8
 * @ Description:
 */
public interface SyEmpmenupowerService {
    //添加
    boolean addMenupower(SyEmpmenupower syEmpmenupower);
    //根据员工id查询;其所有权限
    List<SyEmpmenupower> getByEmpIdAll(Integer id);
    //根据员工id删除所有再进行添加
    boolean delByEmpIdAll(Integer id);
}
