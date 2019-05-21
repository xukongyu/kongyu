package com.huarui.zls.service;

import com.huarui.zls.pojo.UsUser;

import java.util.List;

public interface UsUserService {
    List<UsUser> seluser(UsUser us);
   UsUser selByid(String userno);
    int updusermoney(UsUser ususer);
}
