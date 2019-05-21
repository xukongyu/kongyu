package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyDept;
import com.huarui.zls.service.SyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 14:27 2019/4/4
 * @ Description:部门控制层
 */
@Controller
@RequestMapping("/dept")
public class SyDeptController {

    @Autowired
    private SyDeptService syDeptService;
    //查询全部
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<SyDept> all = syDeptService.getAll();
        model.addAttribute("syDepts",all);
        return "/page/sys_dept";
    }
    //删除
    @RequestMapping("/delDept")
    public String delDept(String id ){
        boolean b = syDeptService.delDept(Integer.valueOf(id));
        return "redirect:/dept/getAll";
    }
    //添加
    @RequestMapping("/deptAdd")
    public String addDept(SyDept syDept){
        boolean b = syDeptService.addDept(syDept);
        if(b){
            return "redirect:/dept/getAll";
        }else {
            return "forward:/jihe/deptAdd?mess=1";
        }

    }
    //修改查询
    @RequestMapping("/getOne")
    public String getOne(String id,Model model){
        SyDept syDept = syDeptService.getOne(Integer.valueOf(id));
        model.addAttribute("dept",syDept);
        model.addAttribute("url","/dept/updDept");
        return "/page/sys_dept_add";
    }
    //修改
    @RequestMapping("/updDept")
    public  String updDept(SyDept syDept){
        boolean b = syDeptService.updDept(syDept);
        System.out.println(b);
        return "redirect:/dept/getAll";
    }
}
