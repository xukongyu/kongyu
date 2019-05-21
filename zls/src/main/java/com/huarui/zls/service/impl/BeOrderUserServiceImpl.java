package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.BeOrderuserMapper;
import com.huarui.zls.pojo.BeOrderuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:22 2019/4/11
 * @ Description:工单详情服务实现层
 */
@Service
public class BeOrderUserServiceImpl implements com.huarui.zls.service.BeOrderUserService {
    @Autowired
    private BeOrderuserMapper beOrderuserMapper;

    //根据工单id 添加工单详情 可能是多个
    @Override
    public boolean addOrderUser(BeOrderuser beOrderuser){
        return beOrderuserMapper.addOrderUser(beOrderuser);
    }
    //根据工单id查询所有所属用户
    public  List<BeOrderuser> getByOrderNoAll(String orderno){
        return beOrderuserMapper.getByOrderNoAll(orderno);
    }
    //缴费后修改属性 根据自身id
    public boolean updJiaofeiYes(BeOrderuser beOrderuser){
        return beOrderuserMapper.updJiaofeiYes(beOrderuser);
    }
}
