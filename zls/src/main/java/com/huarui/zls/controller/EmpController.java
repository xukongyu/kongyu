package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyDept;
import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.pojo.SyEmpandDept;
import com.huarui.zls.pojo.SyMenu;
import com.huarui.zls.service.SyDeptService;
import com.huarui.zls.service.SyEmpService;
import com.huarui.zls.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 19:54 2019/4/2
 * @ Description:员工控制层
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private SyEmpService syEmpService;
    @Autowired
    private SyMenuService syMenuService;
    //验证员工登录是否成功 许做
    @RequestMapping("/yanZhen")
    public String yanZhen(HttpSession session, Model model, SyEmp emp){
        SyEmp syemp = syEmpService.getYanZhen(emp);
        if(syemp!=null){
            //将登录员工绑定到session会话
            session.setAttribute("emp",syemp);
            //根据当前登陆者获取其菜单权限
            List<SyMenu> all = syMenuService.getAll();
            System.out.println(all.get(0).getMenuname());
            model.addAttribute("menus",all);
            if(syemp.getDeptid()!=0){
                System.out.println(syemp.getId());
                List<SyMenu> empidInner = syMenuService.getEmpidInner(syemp.getId());
                for (SyMenu s1  : empidInner){
                    System.out.println(s1);
                }
                List<SyMenu> empidInners = syMenuService.getEmpidInners(syemp.getId());
                for (SyMenu s  : empidInners){
                    System.out.println(s);
                }
                model.addAttribute("syMenus",empidInner);
                model.addAttribute("syMenuss",empidInners);
                model.addAttribute("mess",1);
            }else{
                model.addAttribute("mess",2);
            }
            return "workspace";
        }else{
            model.addAttribute("mess","账号或密码错误");
            return "login";
        }
    }
    //查询所有
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<SyEmpandDept> all = syEmpService.getAll();
        model.addAttribute("empanddept",all);
        return "/page/sys_emp";
    }
    //删除
    @RequestMapping("/delEmp")
    public String delEmp(String id){
        boolean b = syEmpService.delEmp(Integer.valueOf(id));
        System.out.println(b);
        return "redirect:/emp/getAll";
    }
    //添加
    @RequestMapping("/addEmp")
    public String addEmp(SyEmp emp){
        boolean b = syEmpService.addEmp(emp);
        if(b){
            return "redirect:/emp/getAll";
        }else{
            return "forward:/jihe/empAdd?mess=1";
        }
    }
    @Autowired
    private SyDeptService syDeptService;
    //修改前根据Id查询
    @RequestMapping("/getOne")
    public String getOne(Model model,String id){
        SyEmp syEmp = syEmpService.getOne(Integer.valueOf(id));
        List<SyDept> syDepts = syDeptService.getAll();
        model.addAttribute("emp",syEmp);
        model.addAttribute("url","/emp/updEmp");
        model.addAttribute("depts",syDepts);
        return "/page/sys_emp_add";
    }
    //修改
    @RequestMapping("/updEmp")
    public  String updEmp(SyEmp emp){
        boolean b = syEmpService.updEmp(emp);
        return "redirect:/emp/getAll";
    }
    //给员工设置菜单的权限
    @RequestMapping("/setMenu")
    public String setMenu(Model model){
        List<SyEmpandDept> all = syEmpService.getAll();
        model.addAttribute("empAndDept",all);
        return "/page/sys_menupower";
    }
}
