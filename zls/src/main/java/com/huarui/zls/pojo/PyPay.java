package com.huarui.zls.pojo;

import java.util.Date;
//交费单
public class PyPay {
    private String payno;//交费单号（规则：JF0100000987-201401-02，共22位。JF用户编码-年月-按月流水）

    private String userno;//    用户编码

    private String paytype;//交费方式（坐收 走收 银行代扣）

    private Date paydate;//交费日期

    private String invoice;// 发票号码

    private Double paymoney;//交费金额

    private Double usemoney;//已用金额

    private Integer empid;// 收费员

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno == null ? null : payno.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
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
        this.invoice = invoice == null ? null : invoice.trim();
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

    public PyPay(String payno, String userno, String paytype, Date paydate, String invoice, Double paymoney, Double usemoney, Integer empid) {
        this.payno = payno;
        this.userno = userno;
        this.paytype = paytype;
        this.paydate = paydate;
        this.invoice = invoice;
        this.paymoney = paymoney;
        this.usemoney = usemoney;
        this.empid = empid;
    }
}