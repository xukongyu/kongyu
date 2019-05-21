package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyEmpmenupower;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:02 2019/4/9
 * @ Description:
 */
//这是一个复选框的判断
public class Fuxuan {
    public boolean contains(String id,List<SyEmpmenupower> proofs){
        System.out.println(proofs);
        List<String> ids = new ArrayList<>();
        for(SyEmpmenupower p: proofs){
            ids.add(p.getMenuid().toString());
        }
        return (ids.contains(id));
    }
    public boolean StringandStings(String name,String[] ss){
        List<String> ids =  new ArrayList<>();
        if(ss.length>0){
            for (String s  : ss){
                ids.add(s);
            }
            return ids.contains(name);
        }
        return false;

    }


}
