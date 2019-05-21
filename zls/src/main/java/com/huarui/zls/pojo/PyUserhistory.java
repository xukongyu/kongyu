package com.huarui.zls.pojo;

import java.util.Date;
//用户历史详单
public class PyUserhistory {
    private Integer id;

    private String userno;//用户编码

    private Integer typee;// 记录类型（0水费单 1交费单）

    private String orderno;//   水费单或交费单号

    private Date datee;// 建单时间

    private Integer prevalue;// 上月表码（仅水费单有值）

    private Integer curvalue;//本月表码（仅水费单有值）

    private Integer amount;//    用水量  （仅水费单有值）

    private Double billmoney;//    应缴水费（仅水费单有值）

    private Double paymoney;//   交费金额（仅交费单有值）

    private Double usermoney;//余额/欠费（正数表示余额    负数表示欠费）

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

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public Integer getPrevalue() {
        return prevalue;
    }

    public void setPrevalue(Integer prevalue) {
        this.prevalue = prevalue;
    }

    public Integer getCurvalue() {
        return curvalue;
    }

    public void setCurvalue(Integer curvalue) {
        this.curvalue = curvalue;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(Double billmoney) {
        this.billmoney = billmoney;
    }

    public Double getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Double paymoney) {
        this.paymoney = paymoney;
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }
}