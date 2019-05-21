
package com.huarui.zls.controller;

import com.huarui.zls.pojo.IvInvoice;
import com.huarui.zls.pojo.SyEmp;
import com.huarui.zls.service.IvInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {
@Autowired
    private IvInvoiceService invoiceService;
@RequestMapping("/selectByempid")
//查询当前登陆用户的发票，转入收费窗口
    public String selectByempid(HttpServletRequest req, Model model){
     SyEmp emp =(SyEmp)req.getSession().getAttribute("emp");
     Integer id = emp.getId();
         List<IvInvoice> lis = invoiceService.selectByempid(id);
         model.addAttribute("list",lis);
         return "page/pay_window";
    }
    @RequestMapping("/updsy")
    public String updsy(Model model, HttpServletRequest request){
       SyEmp syEmp=(SyEmp) request.getSession().getAttribute("emp");
       Integer empid=syEmp.getId();
        String fapiao= request.getParameter("fapiao");
        Date date=new Date();
        IvInvoice invoice = new IvInvoice(fapiao, 0, empid, null, null, null, 1 == 1, date, null, null, null, null);
        int i1 = invoiceService.updUsed(invoice);
    return selectByempid(request,model);
    }
}
