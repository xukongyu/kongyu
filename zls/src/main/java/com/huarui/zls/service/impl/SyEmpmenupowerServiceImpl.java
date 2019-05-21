package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyEmpmenupowerMapper;
import com.huarui.zls.pojo.SyEmpmenupower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:09 2019/4/8
 * @ Description:员工菜单权限服务实现层
 */
@Service
public class SyEmpmenupowerServiceImpl implements com.huarui.zls.service.SyEmpmenupowerService {
    @Autowired
    private SyEmpmenupowerMapper syEmpmenupowerMapper;
    //添加
    @Override
    public  boolean addMenupower(SyEmpmenupower syEmpmenupower){
       return   syEmpmenupowerMapper.addMenupower(syEmpmenupower);
    }
    //根据员工id查询;其所有权限
    public List<SyEmpmenupower> getByEmpIdAll(Integer id){
        return syEmpmenupowerMapper.getByEmpIdAll(id);
    }
    //根据员工id删除所有再进行添加
    public boolean delByEmpIdAll(Integer id){
        return syEmpmenupowerMapper.delByEmpIdAll(id);
    }
}
