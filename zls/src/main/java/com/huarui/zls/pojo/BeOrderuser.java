package com.huarui.zls.pojo;

import java.math.BigDecimal;
// 工单用户详表
public class BeOrderuser {
    private Integer id;

    private String orderno;//所属工单



    private String username;//    用户姓名

    private String phone;//联系电话

    private String smsphone;//短信电话

    private String address;// 联系地址

    private BigDecimal projectmoney;//应交金额

    private BigDecimal realmoney;//  实交金额

    private String invoiceno;//发票号

    private String formula;// 提比提量值

    private String contractnum;//合同编号

    private Integer metertypeid;// 表径（即水表类型）

    private String metername;//身表码

    private Integer mavalue;// 最大表码值

    private Integer startvalue;//起始底码

    private String meterfactory;//  水表厂家

    private String docnum;//档案编号

    private String userno;//最终产生的用户编号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSmsphone() {
        return smsphone;
    }

    public void setSmsphone(String smsphone) {
        this.smsphone = smsphone == null ? null : smsphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getProjectmoney() {
        return projectmoney;
    }

    public void setProjectmoney(BigDecimal projectmoney) {
        this.projectmoney = projectmoney;
    }

    public BigDecimal getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(BigDecimal realmoney) {
        this.realmoney = realmoney;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum == null ? null : contractnum.trim();
    }

    public Integer getMetertypeid() {
        return metertypeid;
    }

    public void setMetertypeid(Integer metertypeid) {
        this.metertypeid = metertypeid;
    }

    public String getMetername() {
        return metername;
    }

    public void setMetername(String metername) {
        this.metername = metername == null ? null : metername.trim();
    }

    public Integer getMavalue() {
        return mavalue;
    }

    public void setMavalue(Integer mavalue) {
        this.mavalue = mavalue;
    }

    public Integer getStartvalue() {
        return startvalue;
    }

    public void setStartvalue(Integer startvalue) {
        this.startvalue = startvalue;
    }

    public String getMeterfactory() {
        return meterfactory;
    }

    public void setMeterfactory(String meterfactory) {
        this.meterfactory = meterfactory == null ? null : meterfactory.trim();
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum == null ? null : docnum.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }
}