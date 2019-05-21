package com.huarui.zls.pojo;

import java.util.Date;
//抄表数据
public class RdRead {
    private Integer id;

    private Integer readyear;//抄表年份

    private Integer readmonth;//    抄表月份

    private String userno;//  用户编码

    private String meterno;//  水表编码

    private Integer mavalue;//   最大表码值（冗余数据）

    private Integer volumeid;// 表册ID

    private Integer volumeindex;// 表册中的序号（冗余数据）

    private Integer readempid;// 抄表人

    private Date readdate;//抄表时间

    private Integer prevalue;//上月表码

    private Boolean enter;//已输入

    private Integer curvalue;//本月表码

    private Boolean dial;//转表

    private Integer amount;//用水量

    private String formula;//套用提比提量值

    private Boolean audit;//已审核

    private Integer auditempid;//审核人

    private Date auditdate;//审核日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadyear() {
        return readyear;
    }

    public void setReadyear(Integer readyear) {
        this.readyear = readyear;
    }

    public Integer getReadmonth() {
        return readmonth;
    }

    public void setReadmonth(Integer readmonth) {
        this.readmonth = readmonth;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno == null ? null : meterno.trim();
    }

    public Integer getMavalue() {
        return mavalue;
    }

    public void setMavalue(Integer mavalue) {
        this.mavalue = mavalue;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getVolumeindex() {
        return volumeindex;
    }

    public void setVolumeindex(Integer volumeindex) {
        this.volumeindex = volumeindex;
    }

    public Integer getReadempid() {
        return readempid;
    }

    public void setReadempid(Integer readempid) {
        this.readempid = readempid;
    }

    public Date getReaddate() {
        return readdate;
    }

    public void setReaddate(Date readdate) {
        this.readdate = readdate;
    }

    public Integer getPrevalue() {
        return prevalue;
    }

    public void setPrevalue(Integer prevalue) {
        this.prevalue = prevalue;
    }

    public Boolean getEnter() {
        return enter;
    }

    public void setEnter(Boolean enter) {
        this.enter = enter;
    }

    public Integer getCurvalue() {
        return curvalue;
    }

    public void setCurvalue(Integer curvalue) {
        this.curvalue = curvalue;
    }

    public Boolean getDial() {
        return dial;
    }

    public void setDial(Boolean dial) {
        this.dial = dial;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Boolean getAudit() {
        return audit;
    }

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public Integer getAuditempid() {
        return auditempid;
    }

    public void setAuditempid(Integer auditempid) {
        this.auditempid = auditempid;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }
}