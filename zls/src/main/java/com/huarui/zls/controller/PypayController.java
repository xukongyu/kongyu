package com.huarui.zls.controller;

import com.huarui.zls.pojo.*;
import com.huarui.zls.service.IvInvoiceService;
import com.huarui.zls.service.PapayService;
import com.huarui.zls.service.UsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pypay")
public class PypayController {
    @Autowired
    private IvInvoiceService invoiceService;
    @Autowired
    private PapayService papayService;
    @Autowired
    private UsUserService userService;
    @Autowired
    private InvoiceController invoiceController;

    @RequestMapping("/inspypay")
    public String inspypay(HttpSession session,HttpServletRequest request, Model model) {
        int empid = Integer.parseInt(request.getParameter("empid"));
        String userno = request.getParameter("userno");
        String ssmoney = request.getParameter("ssmoney");
        String yjmoney = request.getParameter("yjmoney");
        String cqmoney = request.getParameter("cqmoney");
        String zlmoney = request.getParameter("zlmoney");
        String fapiao = request.getParameter("fapiao");
        String empname = request.getParameter("empname");
        String username = request.getParameter("username");
        String usaddress = request.getParameter("usaddress");
        Date a = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(a);
        Calendar now = Calendar.getInstance();
        String yue = null;
        if ((now.get(Calendar.MONTH) + 1) < 10) {
            yue = "0" + (now.get(Calendar.MONTH) + 1);
        } else {
            yue = "" + (now.get(Calendar.MONTH) + 1);
        }
        double usemoney = 0;
        System.out.println("----" + cqmoney);
        if (cqmoney == null || cqmoney == "") {
            usemoney = 0;
        } else {
            usemoney =Double.parseDouble(ssmoney);
        }
        String payno = "JF" + userno + now.get(Calendar.YEAR) + "" + yue + "" + now.get(Calendar.DAY_OF_MONTH);
        PyPay pyPay = new PyPay(payno, userno, "坐收", a, fapiao, Double.parseDouble(ssmoney), usemoney, empid);
        UsUser usUser = new UsUser();
        usUser.setUserno(userno);
        usUser.setUsername(username);
        usUser.setAddress(usaddress);
        usUser.setUsermoney(Double.parseDouble(zlmoney));
        int i = userService.updusermoney(usUser);
        int ff = papayService.inspypay(pyPay);
        IvInvoice invoice = new IvInvoice(fapiao, 0, empid, null, null, null, 1 == 1, a, null, null, null, null);
        int i1 = invoiceService.updUsed(invoice);
        numberTocn zdx=new numberTocn();
        BigDecimal money=new BigDecimal(Double.parseDouble(ssmoney));
        String s = zdx.number2CNMontrayUnit(money);
        session.setAttribute("pyUsuser", usUser);
        session.setAttribute("Pysession", pyPay);
        session.setAttribute("nowdata",dateNowStr);
        session.setAttribute("ssmoney",s);
        return "page/pay_printInvoice";
    }
    @RequestMapping("/selpapayByid")
    public String  selpapayByid(HttpServletRequest request, HttpSession sesion,Model model){
        String id = request.getParameter("id");
        List<pypayss> list=papayService.selpapayByid(id);
        sesion.setAttribute("pypayss",list.get(0));
        SyEmp emp =(SyEmp)request.getSession().getAttribute("emp");
        Integer uid = emp.getId();
        List<IvInvoice> lis = invoiceService.selectByempid(uid);
        System.out.println("invoda长度=="+lis.size());
        model.addAttribute("list",lis);
        return "page/pay_window_reInvoice";
    }

}
