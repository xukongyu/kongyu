package com.huarui.zls.pojo;

import java.util.Date;
//水表
public class UsMeter {
    private String meterno;//水表编号（14位，规则：M+10位用户编码+杠+2位流水号。如：M0100000987-02，表示用户0100000987的第2块水表，此用户换过一次表。）

    private String userno;//所属用户

    private String metername;//表身码

    private Integer metertypeid;//水表类型

    private Integer mavalue;//最大表码值

    private Integer startvalue;//起始底码（仅供参考）

    private Date setupdate;//装表日期

    private String factory;//水表厂家

    private Boolean disabled;//禁用 （0可使用 1已禁用）

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno == null ? null : meterno.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getMetername() {
        return metername;
    }

    public void setMetername(String metername) {
        this.metername = metername == null ? null : metername.trim();
    }

    public Integer getMetertypeid() {
        return metertypeid;
    }

    public void setMetertypeid(Integer metertypeid) {
        this.metertypeid = metertypeid;
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

    public Date getSetupdate() {
        return setupdate;
    }

    public void setSetupdate(Date setupdate) {
        this.setupdate = setupdate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}