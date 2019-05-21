package com.huarui.zls.pojo;

import java.util.Date;

public class pypayss {
    private String payno;//交费单号（规则：JF0100000987-201401-02，共22位。JF用户编码-年月-按月流水）

    private String userno;//    用户编码
    private String username;
    private String paytype;//交费方式（坐收 走收 银行代扣）

    private Date paydate;//交费日期

    private String invoice;// 发票号码

    private Double paymoney;//交费金额

    private Double usemoney;//已用金额
    private Integer empid;// 收费员
    private Integer id;
    private String empname;
    private Integer invoicetype;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Double getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Double paymoney) {
        this.paymoney = paymoney;
    }

    public Double getUsemoney() {
        return usemoney;
    }

    public void setUsemoney(Double usemoney) {
        this.usemoney = usemoney;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public pypayss(){

    }

    public pypayss(String payno, String userno,String username, String paytype, Date paydate, String invoice, Double paymoney, Double usemoney, Integer empid, Integer id, String empname, Integer invoicetype) {
        this.payno = payno;
        this.userno = userno;
        this.username=username;
        this.paytype = paytype;
        this.paydate = paydate;
        this.invoice = invoice;
        this.paymoney = paymoney;
        this.usemoney = usemoney;
        this.empid = empid;
        this.id = id;
        this.empname = empname;
        this.invoicetype = invoicetype;
    }
}
