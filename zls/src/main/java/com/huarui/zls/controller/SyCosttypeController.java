package com.huarui.zls.controller;

import com.huarui.zls.pojo.SyCosttype;
import com.huarui.zls.service.SyCosttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 15:24 2019/4/10
 * @ Description:费用类型控制层
 */
@Controller
@RequestMapping("/costtype")
public class SyCosttypeController {

    @Autowired
    private SyCosttypeService syCosttypeService;
    //获取所有类型为用水的
    @RequestMapping("/getYongshuiAll")
    public String getYongshuiAll(Model model){
        List<SyCosttype> yongShuiAll = syCosttypeService.getYongShuiAll();
        model.addAttribute("costs",yongShuiAll);
        return "/page/sys_waterType";
    }
    //禁用该类型
    @RequestMapping("/del")
    public String delCost(String id,String mess){
        syCosttypeService.updCost(Integer.valueOf(id));
        if(mess!=null){
            return "redirect:/costtype/getFuJiaAll";
        }
        return "redirect:/costtype/getYongshuiAll";
    }
    //添加类型
    @RequestMapping("/addCost")
    public String addCost(SyCosttype costtype){
        boolean b = syCosttypeService.addCost(costtype);
        if(b==false){
            return "redirect:/costtype/getYongshuiAll";
        }else{
            return "forward:/jihe/costAdd?mess=1";
        }
    }
    //修改前查询
    @RequestMapping("/getOne")
    public  String getOne(String id,Model model,String a){

        SyCosttype one = syCosttypeService.getOne(Integer.valueOf(id));
        String surchargetext = one.getSurchargetext();
        String[] split = surchargetext.split("、");

        model.addAttribute("cost",one);
        if(a!=null){
            model.addAttribute("fuxuan",new Fuxuan());
            model.addAttribute("checkbox",new String[]{"生活用水","商业用水","工业用水","行政用水","军区用水","特种用水"});
            model.addAttribute("split",split);
            model.addAttribute("url","/costtype/updCostFuJia");
            return "/page/sys_surcharge_add";
        }
        model.addAttribute("url","/costtype/updCost");
        return "/page/sys_waterType_add";
    }
    //修改
    @RequestMapping("/updCost")
    public String updCost(SyCosttype costtype){
        boolean b = syCosttypeService.updCosts(costtype);
        return "redirect:/costtype/getYongshuiAll";
    }
    //获取所有附加类型
    @RequestMapping("/getFuJiaAll")
    public String getFuJiaAll(Model model){
        List<SyCosttype> fuJiaAll = syCosttypeService.getFuJiaAll();
        model.addAttribute("costs",fuJiaAll);
        return "/page/sys_surcharge";
    }
    //添加附加类型
    @RequestMapping("/addCostFuJia")
    public String addCostFuJia(SyCosttype costtype,String[] s){
        StringBuffer sb = new StringBuffer();
        for (int i  = 0 ; i < s.length;i++){
            sb.append(s[i]);
            if(i+1 != s.length){
                sb.append("、");
            }
        }
        costtype.setSurchargetext(sb.toString());
        boolean b = syCosttypeService.addCostFuJia(costtype);
        if(b){
            return "redirect:/costtype/getFuJiaAll";
        }else{
            return "/jihe/costAdd?mess=1&aa=1";
        }

    }
    //修改附加类型
    @RequestMapping("/updCostFuJia")
    public String updCostFuJia(SyCosttype costtype){
        boolean b = syCosttypeService.updCostFuJia(costtype);
        return "redirect:/costtype/getFuJiaAll";
    }
}
