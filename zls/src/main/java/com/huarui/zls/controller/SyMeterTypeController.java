package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyMetertype;
import com.huarui.zls.service.SyMeterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:35 2019/4/3
 * @ Description:水表型号控制层
 */
@Controller
@RequestMapping("/meterType")
public class SyMeterTypeController {

    @Autowired
    private SyMeterTypeService syMeterTypeService;

    //查询所有 跳转水表型号界面
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<SyMetertype> syMetertypes = syMeterTypeService.getAll();
        model.addAttribute("meterTypes",syMetertypes);
        return "/page/sys_meterType";
    }
    //删除 修改状态为禁用
    @RequestMapping("/delMeter")
    public String delMeter(String id){
        boolean b = syMeterTypeService.updMeter(Integer.valueOf(id));
        return "redirect:/meterType/getAll";
    }
    //添加
    @RequestMapping("/addMeterType")
    public String addMeterType(SyMetertype syMetertype){
        boolean b = syMeterTypeService.addMeterType(syMetertype);
        if(b){
            return "redirect:/meterType/getAll";
        }else{
            return "forward:/jihe/meterTypeAdd?mess=1";
        }

    }
    //修改前查询
    @RequestMapping("/getOne")
    public String getOne(String id,Model model){
        SyMetertype syMetertype = syMeterTypeService.getOne(Integer.valueOf(id));
        model.addAttribute("url","/meterType/updMeterType");
        model.addAttribute("meterType",syMetertype);
        return "/page/sys_meterType_add";
    }
    @RequestMapping("/updMeterType")
    public String updMeterType(SyMetertype syMetertype){
        boolean b = syMeterTypeService.updMeterType(syMetertype);
        System.out.println(b);
        return "redirect:/meterType/getAll";
    }
}
