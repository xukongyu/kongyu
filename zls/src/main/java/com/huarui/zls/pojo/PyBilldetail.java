package com.huarui.zls.pojo;

import java.util.Date;
//水费单明细
public class PyBilldetail {
    private Integer id;

    private String billno;//所属水费单

    private String userno;// 用户编码

    private String costtypecode;//  费用项编码

    private Integer amount;//水量

    private Double price;//单价

    private Double detailmoney;//应收金额

    private Double realmoney;//实收金额

    private Boolean balance;//已结清

    private Date balancedate;//结清日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getCosttypecode() {
        return costtypecode;
    }

    public void setCosttypecode(String costtypecode) {
        this.costtypecode = costtypecode == null ? null : costtypecode.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDetailmoney() {
        return detailmoney;
    }

    public void setDetailmoney(Double detailmoney) {
        this.detailmoney = detailmoney;
    }

    public Double getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(Double realmoney) {
        this.realmoney = realmoney;
    }

    public Boolean getBalance() {
        return balance;
    }

    public void setBalance(Boolean balance) {
        this.balance = balance;
    }

    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }
}