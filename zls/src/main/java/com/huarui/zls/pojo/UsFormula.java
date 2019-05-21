package com.huarui.zls.pojo;
//提比提量
public class UsFormula {
    private Integer id;

    private String userno;//用户编码

    private String watertypecode;// 用水类型代码（其实就是费用类型代码）

    private String allottext;// 提取值表述（仅供参考，如：80%）

    private Integer allottype;//提取方式（0提量 1提比 2取剩余）

    private Integer allotvalue;//提取值（提量时表示水量，提比时表示百分比，取剩余时此字段无用）

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

    public String getWatertypecode() {
        return watertypecode;
    }

    public void setWatertypecode(String watertypecode) {
        this.watertypecode = watertypecode == null ? null : watertypecode.trim();
    }

    public String getAllottext() {
        return allottext;
    }

    public void setAllottext(String allottext) {
        this.allottext = allottext == null ? null : allottext.trim();
    }

    public Integer getAllottype() {
        return allottype;
    }

    public void setAllottype(Integer allottype) {
        this.allottype = allottype;
    }

    public Integer getAllotvalue() {
        return allotvalue;
    }

    public void setAllotvalue(Integer allotvalue) {
        this.allotvalue = allotvalue;
    }
}