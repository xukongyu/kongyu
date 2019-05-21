package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.BeOrderMapper;
import com.huarui.zls.pojo.BeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:41 2019/4/11
 * @ Description:业扩工单服务实现层
 */
@Service
public class BeOrderServiceImpl implements com.huarui.zls.service.BeOrderService {

    @Autowired
    private BeOrderMapper beOrderMapper;

    //在建业扩工单前先查询 获取当前最大的
    @Override
    public BeOrder getOrderNoDesc(){
      return   beOrderMapper.getOrderNoDesc();
    }
    //添加业扩工单
    public boolean addOrder(BeOrder beOrder){
        return beOrderMapper.addOrder(beOrder);
    }
    //查询所有初审状态的工单
   public  List<BeOrder> selStepId(Integer id){
        return beOrderMapper.selStepId(id);
    }
    //申请不通过的
   public boolean shenNo(BeOrder beOrder){
        return beOrderMapper.shenNo(beOrder);
    }
    //审核通过
    public boolean  shenYes(BeOrder beOrder){
        return beOrderMapper.shenYes(beOrder);
    }
    //缴费不通过
   public   boolean jiaofeiNo(BeOrder beOrder){
        return  beOrderMapper.jiaofeiNo(beOrder);
    }
    //缴费通过
    public boolean jiaoFeiYes(BeOrder beOrder){
        return beOrderMapper.jiaoFeiYes(beOrder);
    }
}
