package com.huarui.zls.controller;

import com.huarui.zls.pojo.BeOrder;
import com.huarui.zls.pojo.BeOrderuser;
import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.pojo.SyMetertype;
import com.huarui.zls.service.BeOrderService;
import com.huarui.zls.service.BeOrderUserService;
import com.huarui.zls.service.SyMeterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:16 2019/4/11
 * @ Description:业扩工单控制层
 */
@Controller
@RequestMapping("/order")
public class BeOrderController {

    @Autowired
    private SyMeterTypeService syMeterTypeService;

    @Autowired
    private BeOrderService beOrderService;
    @Autowired
    private BeOrderUserService beOrderUserService;
    //办理新户业务
    @RequestMapping("/xinhu")
    public String xinHu(Model model){
        //拿到所有水表型号
        List<SyMetertype> all = syMeterTypeService.getAll();
        model.addAttribute("mts",all);
        return "/page/be__request1";
    }
    //添加新的业扩工单
    @RequestMapping("/addOrderAndOrderUser")
    public String addOrderAndOrderUser(HttpSession session,BeOrder beOrder, String[] names, String[] phones , String[] zuojis, String[] dizhis ){

        //先查询出最近添加的数据 做判断用
        BeOrder beorder = beOrderService.getOrderNoDesc();
        String orderno = beorder.getOrderno();
        String substring = orderno.substring(3, 11);
        String substring1 = orderno.substring(12, 16);
        StringBuffer sb= new StringBuffer("B1-");
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(date);
        sb.append(format);
        if(!format.equals(substring)){
            sb.append("-0001");
        }else{
            int i = Integer.valueOf(substring1) + 1;
           // 0代表前面要补的字符
           // 4代表字符串长度
            // d表示参数为整数类型
            String format1 = String.format("%04d", i);
            sb.append("-"+format1);
        }
        beOrder.setOrderno(sb.toString());//设置工号id
        beOrder.setOrdertype(1); //设置工单类型
        beOrder.setStepid(1);//设置当前步骤ID（1-8步骤，0完成，-1终止）
        //设置建单人
        SyEmp emp = (SyEmp) session.getAttribute("emp");
        beOrder.setCreateemp(emp.getId());
        //设置建单时间
        beOrder.setCreatedate(new Date(System.currentTimeMillis()));
        boolean b = beOrderService.addOrder(beOrder);
        if(b){
            //建单成功的话往工单详情添加数据
            for (int i = 0;i<names.length;i++){
                BeOrderuser beOrderuser = new BeOrderuser();
                beOrderuser.setOrderno(sb.toString());
                beOrderuser.setUsername(names[i]);
                beOrderuser.setPhone(phones[i]);
                beOrderuser.setSmsphone(zuojis[i]);
                beOrderuser.setAddress(dizhis[i]);
                beOrderuser.setMetertypeid(beOrder.getMetertypeid());
                beOrderUserService.addOrderUser(beOrderuser);
            }
        }
        //操作完成跳转到初步审核去
        return "redirect:/order/selStepId";
    }
    //查询所有初审状态的工单
    @RequestMapping("/selStepId")
    public String selStepId(Model model){
        List<BeOrder> beOrders = beOrderService.selStepId(1);
        model.addAttribute("orders",beOrders);
        return "/page/be__audit";
    }
    //从审核主界面跳到审核单个
    @RequestMapping("/shenOne")
    public String shenOne(String id,String name,Model model){

        String substring = id.substring(1, id.length() - 1);
        System.out.println(substring);
        String substring1 = name.substring(1, name.length() - 1);
        model.addAttribute("id",substring);
        model.addAttribute("name",substring1);
        return "/page/be__auditForm";
    }
    //审核失败
    @RequestMapping("/shenNo")
    public String shenNo(String orderno ,String username,String auditmessage,HttpSession session){
        BeOrder beOrder = new BeOrder();
        beOrder.setOrderno(orderno);
        beOrder.setAuditmessage(auditmessage);
        beOrder.setLasteditdate(new Date(System.currentTimeMillis()));
        beOrder.setLasteditemp(((SyEmp)session.getAttribute("emp")).getId());
        beOrder.setAuditempid(((SyEmp)session.getAttribute("emp")).getId());
        beOrder.setAbortcause(auditmessage);
        beOrderService.shenNo(beOrder);
        return "redirect:/order/selStepId";
    }
    //申请成功
    @RequestMapping("/shenYes")
    public String shenYes(BeOrder beOrder,HttpSession session){
        beOrder.setLasteditdate(new Date(System.currentTimeMillis()));
        beOrder.setLasteditemp(((SyEmp)session.getAttribute("emp")).getId());
        beOrder.setAuditempid(((SyEmp)session.getAttribute("emp")).getId());
        beOrderService.shenYes(beOrder);
        return "redirect:/order/jiaoShiGong";
    }
    //初审过了后的交施工费的查询所有
    @RequestMapping("/jiaoShiGong")
    public String jiaoShiGong(Model model){
        List<BeOrder> beOrders = beOrderService.selStepId(2);
        model.addAttribute("orders",beOrders);
        return  "/page/be__pay";
    }
    //详情信息
    @RequestMapping("/toJiaoFei")
    public String toJiaoFei(String orderno ,String username,Model model){
        String substring = orderno.substring(1, orderno.length() - 1);
        System.out.println(substring);
        String substring1 = username.substring(1, username.length() - 1);
        System.out.println(substring1);
        List<BeOrderuser> byOrderNoAll = beOrderUserService.getByOrderNoAll(substring);
        model.addAttribute("orderusers",byOrderNoAll);
        model.addAttribute("orderno",substring);
        model.addAttribute("username",substring1);
        return "/page/be__payForm";
    }
    //缴费不成功 返回审核阶段
    @RequestMapping("/jiaoFeiNo")
    public  String jiaoFeiNo(String orderno,HttpSession session){
        BeOrder beOrder = new BeOrder();

        beOrder.setOrderno(orderno.substring(1,orderno.length()-1));
        beOrder.setLasteditemp(((SyEmp)session.getAttribute("emp")).getId());
        beOrder.setLasteditdate(new Date(System.currentTimeMillis()));
        beOrderService.jiaofeiNo(beOrder);
        return "redirect:/order/jiaoShiGong";
    }
    //缴费成功 跳水费清单
    @RequestMapping("jiaoFeiYes")
    public String jiaoFeiYes(BeOrder beOrder,String[] a1,String[] a2,String[] a3,HttpSession session, String[] ids){
        beOrder.setPaydate(new Date(System.currentTimeMillis()));
        beOrder.setLasteditemp(((SyEmp)session.getAttribute("emp")).getId());
        beOrder.setLasteditdate(new Date(System.currentTimeMillis()));
        boolean b = beOrderService.jiaoFeiYes(beOrder);
        if(b){
           for (int i = 0 ; i<a1.length ; i++){
               BeOrderuser beOrderuser = new BeOrderuser();
               beOrderuser.setProjectmoney(BigDecimal.valueOf(Double.parseDouble(a1[i])));
               beOrderuser.setRealmoney(BigDecimal.valueOf(Double.parseDouble(a2[i])));
               beOrderuser.setInvoiceno(a3[i]);
               beOrderuser.setId(Integer.valueOf(ids[i]));
               beOrderUserService.updJiaofeiYes(beOrderuser);
           }
        }
        return "redirect:/order/jiaoShiGong";
    }

}
