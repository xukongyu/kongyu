package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.SyAreaMapper;
import com.huarui.zls.pojo.SyArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:14 2019/4/3
 * @ Description:抄表辖区服务实现层
 */
@Service
public class SysAreaServiceImpl implements com.huarui.zls.service.SysAreaService {
    @Autowired
    private SyAreaMapper syAreaMapper;

    @Override
    public List<SyArea> getAll(){
      return   syAreaMapper.getAll();
    }
    //禁用当前id
    public boolean delArea(Integer id){
        return syAreaMapper.delArea(id);
    }
    //添加
    public boolean addArea(SyArea area){
        return syAreaMapper.addArea(area);
    }
    //修改前查询
    public SyArea getOne(Integer id){
        return syAreaMapper.getOne(id);
    }
    //修改
   public boolean updArea(SyArea area){
        return  syAreaMapper.updArea(area);
    }

}
