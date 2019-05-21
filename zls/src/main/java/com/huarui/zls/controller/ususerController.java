package com.huarui.zls.controller;


import com.huarui.zls.pojo.UsUser;
import com.huarui.zls.pojo.pypayss;
import com.huarui.zls.service.PapayService;
import com.huarui.zls.service.UsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/ususer")
public class ususerController {
    @Autowired
    private UsUserService usservice;
    @Autowired
    private PapayService papayService;
    //查询全部用水户
    @RequestMapping("/seluser")
public List<UsUser> seluser(HttpServletRequest req){
        String uid =req.getParameter("uid");
        String abc = req.getParameter("abc");
        String smsphone = req.getParameter("smsphone");
        String phone = req.getParameter("phone");
         String address = req.getParameter("address");
       String uname = req.getParameter("uname");
        String did = req.getParameter("did");
        UsUser us= new UsUser(uid,uname,abc,null,address,phone,smsphone,0,null,null,null,null,null,null,null,did,null,null,null,null,null,null);
        List<UsUser> list=usservice.seluser(us);
        return list;
}
//根据id查询用水户
@RequestMapping("/selByid")
public UsUser selByid(HttpServletRequest req, HttpSession session,HttpServletResponse response){
    ModelAndView model=new ModelAndView();
        String id = req.getParameter("id");
     UsUser usUser = usservice.selByid(id);
     return usUser;
}
//查询水费单
@RequestMapping("/selallpypay")
public List<pypayss>  selall(){
    List<pypayss> list=papayService.selall();
    System.out.println("===="+list.size());
    return list;
}

}
