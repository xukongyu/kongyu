package com.huarui.zls.pojo;

import java.util.Date;
//水费单
public class PyBill {
    private String billno;//水费单号（规则：SF0100000987-201308，共19位，SF+用户编码+年月）

    private Integer readid;//对应的抄表ID

    private String userno;// 用户编码

    private Date createdate;//建单日期

    private Double billmoney;// 应交金额

    private Double realmoney;//实交金额

    private Boolean balance;//已结清

    private Date balancedate;//结清日期

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Integer getReadid() {
        return readid;
    }

    public void setReadid(Integer readid) {
        this.readid = readid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Double getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(Double billmoney) {
        this.billmoney = billmoney;
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