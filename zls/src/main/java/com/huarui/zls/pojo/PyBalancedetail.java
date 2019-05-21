package com.huarui.zls.pojo;

import java.util.Date;
//销账明细
public class PyBalancedetail {
    private Integer id;

    private Integer parentid;//总目ID

    private String userno;// 用户编码

    private Date balancedate;// 销账日期

    private Double balancemoney;//销账金额

    private String billno;//水费单号

    private Integer billdetailid;//   水费单明细ID

    private String costtypecode;//费用项编码

    private Double detailrealmoney1;// 销账前实收金额

    private Double detailrealmoney2;// 销账后实收金额

    private String payno;//    交费单号

    private Double payusemoney1;// 销账前已用金额

    private Double payusemoney2;//销账后已用金额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public Integer getBilldetailid() {
        return billdetailid;
    }

    public void setBilldetailid(Integer billdetailid) {
        this.billdetailid = billdetailid;
    }

    public String getCosttypecode() {
        return costtypecode;
    }

    public void setCosttypecode(String costtypecode) {
        this.costtypecode = costtypecode == null ? null : costtypecode.trim();
    }

    public Double getDetailrealmoney1() {
        return detailrealmoney1;
    }

    public void setDetailrealmoney1(Double detailrealmoney1) {
        this.detailrealmoney1 = detailrealmoney1;
    }

    public Double getDetailrealmoney2() {
        return detailrealmoney2;
    }

    public void setDetailrealmoney2(Double detailrealmoney2) {
        this.detailrealmoney2 = detailrealmoney2;
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