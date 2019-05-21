package com.huarui.zls.controller;

import com.huarui.zls.pojo.*;
import com.huarui.zls.service.SyDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 14:18 2019/4/3
 * @ Description:跳转页面的控制层
 */
@Controller
@RequestMapping("/jihe")
public class JiHeController {

    //从主页面跳转到抄表辖区页面  ##进入就报java.io.IOException: 远程主机强迫关闭了一个现有的连接。
    @RequestMapping("/sysarea")
    public String sysArea(){
        return "/page/sys_area";
    }
    //从某个页面转发到主页面去
    @RequestMapping("/index")
    public String workspace(){
        return "workspace";
    }
    //从某个页面跳到login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //从抄表辖区界面跳到抄表辖区添加界面
    @RequestMapping("/areaAdd")
    public String areaAdd(Model model,String mess){
        SyArea area = new SyArea();
        if(mess!=null){
            model.addAttribute("mess","添加失败");
        }
        model.addAttribute("url","/area/addArea");
        model.addAttribute("area",area);
        return "/page/sys_area_add.html";
    }
    //从水表型号页面跳到水表型号添加界面
    @RequestMapping("/meterTypeAdd")
    public String meterTypeAdd(Model model,String mess){
        if(mess!=null){
            model.addAttribute("mess","添加失败");
        }
        model.addAttribute("url","/meterType/addMeterType");
        model.addAttribute("meterType",new SyMetertype());
        return "/page/sys_meterType_add";
    }
    //从部门页面跳到部门添加页面
    @RequestMapping("/deptAdd")
    public String deptAdd(Model model,String mess){
        if(mess!=null){
            model.addAttribute("mess","添加失败");
        }
        model.addAttribute("url","/dept/deptAdd");
        model.addAttribute("dept",new SyDept());
        return "/page/sys_dept_add";
    }
    @Autowired
    private SyDeptService syDeptService;
    //从员工页面跳到员工添加页面
    @RequestMapping("/empAdd")
    public String empAdd(Model model,String mess){
        if(mess!=null){
            model.addAttribute("mess","添加失败");
        }
        List<SyDept> all = syDeptService.getAll();
        model.addAttribute("url","/emp/addEmp");
        model.addAttribute("depts",all);
        model.addAttribute("emp",new SyEmp());
        return "/page/sys_emp_add";
    }
    //主界面跳辖区设置
    @RequestMapping("/setxiaqu")
    public String setXiaqu(){
        return "/page/sys_areapower";
    }
    //从费用类型跳到费用类型添加页面
    @RequestMapping("/costAdd")
    public String costAdd(Model model,String mess,String aa){

        if(mess!=null){
            model.addAttribute("mess","添加失败");
        }
        model.addAttribute("cost",new SyCosttype());
        if(aa!=null){
            model.addAttribute("fuxuan",new Fuxuan());
            model.addAttribute("split",new String[]{});
            model.addAttribute("checkbox",new String[]{"生活用水","商业用水","工业用水","行政用水","军区用水","特种用水"});
            model.addAttribute("url","/costtype/addCostFuJia");
            return  "/page/sys_surcharge_add";
        }
        model.addAttribute("url","/costtype/addCost");
        return "/page/sys_waterType_add";
    }
    //从主页跳到流程设置界面
    @RequestMapping("/syflow")
    public String syFlow(){
        return "/page/sys_flow";
    }

    //从主页面跳到业扩的用户申请界面
    @RequestMapping("/berequest")
    public String beRequest(){
        return "/page/be__request";
    }


    //从用户申请界面跳到分户界面
    @RequestMapping("/berequest2")
    public String beRequest2(){
        return "/page/be__request2";
    }
    //从用户申请界面跳到过户界面
    @RequestMapping("/berequest3")
    public String beRequest3(){
        return "/page/be__request3";
    }
    //从用户申请界面跳到代扣界面
    @RequestMapping("/berequest4")
    public String beRequest4(){
        return "/page/be__request4";
    }
    //从用户申请界面跳到换表界面
    @RequestMapping("/berequest5")
    public String beRequest5(){
        return "/page/be__request5";
    }
    //从用户申请界面跳到重签界面
    @RequestMapping("/berequest6")
    public String beRequest6(){
        return "/page/be__request6";
    }
    //从用户申请界面跳到销户界面
    @RequestMapping("/berequest7")
    public String beRequest7(){
        return "/page/be__request7";
    }
    //从用户申请界面跳到工单界面
    @RequestMapping("/berequest8")
    public String beRequest8(){

        return "/page/be__requestOrder";
    }
    //从主界面跳到交施工费
    @RequestMapping("/bepay")
    public String bepay(){
        return "/page/be__pay";
    }
    @RequestMapping("/shuifei")
    public String shuiFei(){
        return "/page/be__billclear";
    }
}
