package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyArea;
import com.huarui.zls.service.SysAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:06 2019/4/3
 * @ Description:抄表辖区控制层 许做
 */
@Controller
@RequestMapping("/area")
public class SysAreaController {

    @Autowired
    private SysAreaService sysAreaService;
    //查询全部
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<SyArea> all = sysAreaService.getAll();
        model.addAttribute("all",all);
        return "/page/sys_area";
    }
    //删除
    @RequestMapping("/delArea")
    public String delArea(String id){
        //考虑到当前id设计的表太多
        //所以我只让当前id禁用 如果之前用过的还存在 新的想引用就不可以了
        boolean b = sysAreaService.delArea(Integer.valueOf(id));
        System.out.println(b);
        return "redirect:/area/getAll";
    }
    //添加
    @RequestMapping("/addArea")
    public String addArea(SyArea area){
        boolean b = sysAreaService.addArea(area);
        if(b){
            return "redirect:/area/getAll";
        }else {
            return "forward:/jihe/areaAdd?mess=1";
        }
    }
    //修改前查询
    @RequestMapping("/getOne")
    public String getOne(Model model,String id){
        SyArea area = sysAreaService.getOne(Integer.valueOf(id));
        System.out.println(area);
        model.addAttribute("url","/area/updArea");
        model.addAttribute("area",area);
        return "/page/sys_area_add.html";
    }
    //修改
    @RequestMapping("/updArea")
    public String updArea(SyArea area){
        boolean b = sysAreaService.updArea(area);
        System.out.println(b);
        return "redirect:/area/getAll";
    }
}
