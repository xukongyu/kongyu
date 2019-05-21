package com.huarui.zls.pojo;

import java.util.Date;
//用户
public class UsUser {
    private String userno;//用户编码（规则：共10位，前2位表示辖区，后8位是全局流水号）

    private String username;//用户姓名（最多40个汉字）

    private String abc;// 简码

    private Date createdate;//        创建日期

    private String address;//  联系地址（即用水地址）

    private String phone;//   联系电话

    private String smsphone;//  短信电话

    private Integer areaid;//所属辖区

    private String usertype;//用户类型（公户、私户）

    private String paytype;// 收款方式（坐收、走收、银行代扣）

    private String bankname;//  开户银行

    private String banknum;// 银行账号

    private String formula;//    提比提量值

    private Double usermoney;//用户金额（正数是预缴费余额、负数是欠费金额）

    private String meterid;//水表ID

    private String docnum;//  档案编号

    private String pwd;//密码（MD5加密。暂时无用，为将来的移动互联网查询预留的字段）

    private String contractnum;//合同编号（指供水协议的合同编号）

    private Date contractdate;// 合同签订日期

    private Integer volumeid;//所属表册ID

    private Integer volumeorderindex;//    在表册中的序号

    private Boolean disabled;// 禁用 （0可使用 1已禁用）

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc == null ? null : abc.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }

    public String getMeterid() {
        return meterid;
    }

    public void setMeterid(String meterid) {
        this.meterid = meterid == null ? null : meterid.trim();
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum == null ? null : docnum.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum == null ? null : contractnum.trim();
    }

    public Date getContractdate() {
        return contractdate;
    }

    public void setContractdate(Date contractdate) {
        this.contractdate = contractdate;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getVolumeorderindex() {
        return volumeorderindex;
    }

    public void setVolumeorderindex(Integer volumeorderindex) {
        this.volumeorderindex = volumeorderindex;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public UsUser() {
    }

    public UsUser(String userno, String username, String abc, Date createdate, String address, String phone, String smsphone, Integer areaid, String usertype, String paytype, String bankname, String banknum, String formula, Double usermoney, String meterid, String docnum, String pwd, String contractnum, Date contractdate, Integer volumeid, Integer volumeorderindex, Boolean disabled) {
        this.userno = userno;
        this.username = username;
        this.abc = abc;
        this.createdate = createdate;
        this.address = address;
        this.phone = phone;
        this.smsphone = smsphone;
        this.areaid = areaid;
        this.usertype = usertype;
        this.paytype = paytype;
        this.bankname = bankname;
        this.banknum = banknum;
        this.formula = formula;
        this.usermoney = usermoney;
        this.meterid = meterid;
        this.docnum = docnum;
        this.pwd = pwd;
        this.contractnum = contractnum;
        this.contractdate = contractdate;
        this.volumeid = volumeid;
        this.volumeorderindex = volumeorderindex;
        this.disabled = disabled;
    }
}