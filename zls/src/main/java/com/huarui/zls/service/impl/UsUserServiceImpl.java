package com.huarui.zls.service.impl;

import com.huarui.zls.mapper.UsUserMapper;
import com.huarui.zls.pojo.UsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsUserServiceImpl implements com.huarui.zls.service.UsUserService {
    @Autowired
    private UsUserMapper usmapper;
    @Override
    public List<UsUser> seluser(UsUser us){
        System.out.println("进入service:"+us.getUserno());
         List<UsUser> list = usmapper.seluser(us);
       // System.out.println("====="+list.get(0).getUsername());
        return list;
    }
    public UsUser selByid(String userno){
         UsUser usUser = usmapper.selectByPrimaryKey(userno);
         return usUser;
    }
   public int updusermoney(UsUser ususer){
       System.out.println("进入userservice");
        return usmapper.updusermoney(ususer);
    }
}
