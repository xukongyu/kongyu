package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyDeptMapper;
import com.huarui.zls.pojo.SyDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 14:30 2019/4/4
 * @ Description:部门服务实现层
 */
@Service
public class SyDeptServiceImpl implements com.huarui.zls.service.SyDeptService {

    @Autowired
    private SyDeptMapper syDeptMapper;

    //查询全部为禁用的部门
    @Override
    public List<SyDept> getAll(){
        return syDeptMapper.getAll();
    }
    //修改状态为禁用 不是真实删除
    public boolean delDept(Integer id){
        return syDeptMapper.delDept(id);
    }
    //添加
    public boolean addDept(SyDept syDept){
        return syDeptMapper.addDept(syDept);
    }
    //修改前查询
    public SyDept getOne(Integer id){
        return syDeptMapper.getOne(id);
    }
    //修改
    public boolean updDept(SyDept syDept){
        return syDeptMapper.updDept(syDept);
    }
}
