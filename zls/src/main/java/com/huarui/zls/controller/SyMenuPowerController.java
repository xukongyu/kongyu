package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyEmpmenupower;
import com.huarui.zls.pojo.SyMenu;
import com.huarui.zls.service.SyEmpmenupowerService;
import com.huarui.zls.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:12 2019/4/8
 * @ Description:菜单权限控制层
 */
@Controller
@RequestMapping("/menupower")
public class SyMenuPowerController {

    @Autowired
    private SyMenuService syMenuService;
    @Autowired
    private SyEmpmenupowerService syEmpmenupowerService;
    //从菜单权限页面跳到设置权限
    @RequestMapping("/tiaozhuan")
    public String tiaoZhuan(Model model,String id){
        System.out.println(id);
        List<SyEmpmenupower> byEmpIdAll = syEmpmenupowerService.getByEmpIdAll(Integer.valueOf(id));
        List<SyMenu> all = syMenuService.getAll();
        //给复选框添加的判断
        Fuxuan f = new Fuxuan();
        model.addAttribute("fuxuan",f);
        model.addAttribute("symenus",all);
        model.addAttribute("id",id);
        model.addAttribute("emps",byEmpIdAll);
        return "/page/sys_menupower_set";
    }
    //给员工添加权限
    @RequestMapping("/addMenupower")
    public String addMenupower(String[] gg,String[] id){
        for (String idd : id){
            System.out.println(idd);
            syEmpmenupowerService.delByEmpIdAll(Integer.valueOf(idd));
        }
        for (String idd: id){
            for (String a:
                    gg) {
                SyEmpmenupower syEmpmenupower = new SyEmpmenupower();
                syEmpmenupower.setEmpid(Integer.valueOf(idd));
                syEmpmenupower.setMenuid(Integer.valueOf(a));
                syEmpmenupowerService.addMenupower(syEmpmenupower);
            }
        }

        return "redirect:/emp/setMenu";
    }
    //给多选员工添加权限
    @RequestMapping("/tiaozhuans")
    public String tiaoZhuans(Model model,String[] id){
        for (String a : id){
            System.out.println(a);
        }
        List<SyEmpmenupower> byEmpIdAll = new ArrayList<>();
        List<SyMenu> all = syMenuService.getAll();
        //给复选框添加的判断
        Fuxuan f = new Fuxuan();
        model.addAttribute("fuxuan",f);
        model.addAttribute("symenus",all);
        model.addAttribute("id",id);
        model.addAttribute("emps",byEmpIdAll);
        return "/page/sys_menupower_set";
    }
}
