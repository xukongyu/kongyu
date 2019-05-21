package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyMenuMapper;
import com.huarui.zls.pojo.SyMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:25 2019/4/8
 * @ Description:菜单服务实现层
 */
@Service
public class SyMenuServiceImpl implements com.huarui.zls.service.SyMenuService {
    @Autowired
    private SyMenuMapper syMenuMapper;

    //查询所有
    @Override
    public List<SyMenu> getAll(){
        return       syMenuMapper.getAll();
    }
    //根据员工id 两表联查 分组
    public  List<SyMenu> getEmpidInner(Integer id){
        return syMenuMapper.getEmpidInner(id);
    }
    //根据员工id 两表联查
    public  List<SyMenu> getEmpidInners(Integer id){
        return syMenuMapper.getEmpidInners(id);
    }
}
