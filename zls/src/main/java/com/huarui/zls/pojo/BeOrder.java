package com.huarui.zls.pojo;

import java.math.BigDecimal;
import java.util.Date;
//业扩工单
public class BeOrder {
    private String orderno;//业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）

    private Integer ordertype;//工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）

    private Integer stepid;//当前步骤ID（1-8步骤，0完成，-1终止）

    private Integer createemp;// 建单人

    private Date createdate;// 工单创建日期

    private Integer completeemp;// 归档人

    private Date completedate;//工单完成日期

    private Integer lasteditemp;//    最后操作人

    private Date lasteditdate;//      最后操作时间

    private String username;//用户名称

    private String usertype;//  用户类型（私户 公户）

    private String address;//  用户地址

    private String linkman;//         联系人

    private String phone;//联系电话

    private String usetarget;// 接水用途

    private Integer househeight;//房屋层次

    private Integer maxamount;//用水量

    private Integer metertypeid;// 申请表径

    private Integer metercount;// 申请装表表数

    private String userremark;//  用户申请的备注说明

    private String paytype;// 收费方式（坐收 走收 银行代扣）

    private String bankcompany;//  开户银行

    private String banknum;// 银行账号

    private String olduserno;//原用户编码

    private String oldusername;//   原用户姓名

    private String olduserphone;//   原用户电话

    private String olduseraddr;//原用户地址

    private String oldmeter;// 原用户表径（不存ID，直接存文字 ）

    private Integer auditempid;//初步审核人

    private String auditmessage;//初审意见

    private BigDecimal projectmoney;//总应收金额

    private BigDecimal realmoney;//总实收金额

    private Date paydate;//交费日期

    private Date projectdate1;// 开工日期

    private Date projectdate2;//竣工日期

    private Integer areaid;//所属辖区

    private String abortcause;//工单终止原因

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    public Integer getCreateemp() {
        return createemp;
    }

    public void setCreateemp(Integer createemp) {
        this.createemp = createemp;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCompleteemp() {
        return completeemp;
    }

    public void setCompleteemp(Integer completeemp) {
        this.completeemp = completeemp;
    }

    public Date getCompletedate() {
        return completedate;
    }

    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    public Integer getLasteditemp() {
        return lasteditemp;
    }

    public void setLasteditemp(Integer lasteditemp) {
        this.lasteditemp = lasteditemp;
    }

    public Date getLasteditdate() {
        return lasteditdate;
    }

    public void setLasteditdate(Date lasteditdate) {
        this.lasteditdate = lasteditdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsetarget() {
        return usetarget;
    }

    public void setUsetarget(String usetarget) {
        this.usetarget = usetarget == null ? null : usetarget.trim();
    }

    public Integer getHouseheight() {
        return househeight;
    }

    public void setHouseheight(Integer househeight) {
        this.househeight = househeight;
    }

    public Integer getMaxamount() {
        return maxamount;
    }

    public void setMaxamount(Integer maxamount) {
        this.maxamount = maxamount;
    }

    public Integer getMetertypeid() {
        return metertypeid;
    }

    public void setMetertypeid(Integer metertypeid) {
        this.metertypeid = metertypeid;
    }

    public Integer getMetercount() {
        return metercount;
    }

    public void setMetercount(Integer metercount) {
        this.metercount = metercount;
    }

    public String getUserremark() {
        return userremark;
    }

    public void setUserremark(String userremark) {
        this.userremark = userremark == null ? null : userremark.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getBankcompany() {
        return bankcompany;
    }

    public void setBankcompany(String bankcompany) {
        this.bankcompany = bankcompany == null ? null : bankcompany.trim();
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    public String getOlduserno() {
        return olduserno;
    }

    public void setOlduserno(String olduserno) {
        this.olduserno = olduserno == null ? null : olduserno.trim();
    }

    public String getOldusername() {
        return oldusername;
    }

    public void setOldusername(String oldusername) {
        this.oldusername = oldusername == null ? null : oldusername.trim();
    }

    public String getOlduserphone() {
        return olduserphone;
    }

    public void setOlduserphone(String olduserphone) {
        this.olduserphone = olduserphone == null ? null : olduserphone.trim();
    }

    public String getOlduseraddr() {
        return olduseraddr;
    }

    public void setOlduseraddr(String olduseraddr) {
        this.olduseraddr = olduseraddr == null ? null : olduseraddr.trim();
    }

    public String getOldmeter() {
        return oldmeter;
    }

    public void setOldmeter(String oldmeter) {
        this.oldmeter = oldmeter == null ? null : oldmeter.trim();
    }

    public Integer getAuditempid() {
        return auditempid;
    }

    public void setAuditempid(Integer auditempid) {
        this.auditempid = auditempid;
    }

    public String getAuditmessage() {
        return auditmessage;
    }

    public void setAuditmessage(String auditmessage) {
        this.auditmessage = auditmessage == null ? null : auditmessage.trim();
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

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Date getProjectdate1() {
        return projectdate1;
    }

    public void setProjectdate1(Date projectdate1) {
        this.projectdate1 = projectdate1;
    }

    public Date getProjectdate2() {
        return projectdate2;
    }

    public void setProjectdate2(Date projectdate2) {
        this.projectdate2 = projectdate2;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAbortcause() {
        return abortcause;
    }

    public void setAbortcause(String abortcause) {
        this.abortcause = abortcause == null ? null : abortcause.trim();

    }

    @Override
    public String toString() {
        return "BeOrder{" +
                "orderno='" + orderno + '\'' +
                ", ordertype=" + ordertype +
                ", stepid=" + stepid +
                ", createemp=" + createemp +
                ", createdate=" + createdate +
                ", completeemp=" + completeemp +
                ", completedate=" + completedate +
                ", lasteditemp=" + lasteditemp +
                ", lasteditdate=" + lasteditdate +
                ", username='" + username + '\'' +
                ", usertype='" + usertype + '\'' +
                ", address='" + address + '\'' +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                ", usetarget='" + usetarget + '\'' +
                ", househeight=" + househeight +
                ", maxamount=" + maxamount +
                ", metertypeid=" + metertypeid +
                ", metercount=" + metercount +
                ", userremark='" + userremark + '\'' +
                ", paytype='" + paytype + '\'' +
                ", bankcompany='" + bankcompany + '\'' +
                ", banknum='" + banknum + '\'' +
                ", olduserno='" + olduserno + '\'' +
                ", oldusername='" + oldusername + '\'' +
                ", olduserphone='" + olduserphone + '\'' +
                ", olduseraddr='" + olduseraddr + '\'' +
                ", oldmeter='" + oldmeter + '\'' +
                ", auditempid=" + auditempid +
                ", auditmessage='" + auditmessage + '\'' +
                ", projectmoney=" + projectmoney +
                ", realmoney=" + realmoney +
                ", paydate=" + paydate +
                ", projectdate1=" + projectdate1 +
                ", projectdate2=" + projectdate2 +
                ", areaid=" + areaid +
                ", abortcause='" + abortcause + '\'' +
                '}';
    }
}