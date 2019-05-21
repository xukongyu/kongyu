package com.huarui.zls.pojo;

import java.util.Date;
// 销账明细
public class PyBalance {
    private Integer id;

    private String userno;//用户编码

    private Date balancedate;// 销账日期

    private Double balancemoney;//销账金额

    private String billno;//水费单

    private Double billrealmoney1;// 销账前实收金额

    private Double billrealmoney2;//销账后实收金额

    private String payno;// 交费单

    private Double payusemoney1;// 销账前已用金额

    private Double payusemoney2;//销账后已用金额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }

    public Double getBalancemoney() {
        return balancemoney;
    }

    public void setBalancemoney(Double balancemoney) {
        this.balancemoney = balancemoney;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Double getBillrealmoney1() {
        return billrealmoney1;
    }

    public void setBillrealmoney1(Double billrealmoney1) {
        this.billrealmoney1 = billrealmoney1;
    }

    public Double getBillrealmoney2() {
        return billrealmoney2;
    }

    public void setBillrealmoney2(Double billrealmoney2) {
        this.billrealmoney2 = billrealmoney2;
    }

    public String getPayno() {
        return payno;
    }

    public void setPayno(String payno) {
        this.payno = payno == null ? null : payno.trim();
    }

    public Double getPayusemoney1() {
        return payusemoney1;
    }

    public void setPayusemoney1(Double payusemoney1) {
        this.payusemoney1 = payusemoney1;
    }

    public Double getPayusemoney2() {
        return payusemoney2;
    }

    public void setPayusemoney2(Double payusemoney2) {
        this.payusemoney2 = payusemoney2;
    }
}