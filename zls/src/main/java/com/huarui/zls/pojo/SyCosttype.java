package com.huarui.zls.pojo;
//费用类型
public class SyCosttype {
    private Integer id;

    private Integer kind;//类型 （0用水类型 1附加费）

    private String code;//  编码 （用水类型2位数，附加费3位数）

    private String costtypename;//费用类型名称（根据不同情况，建议分别为该字段取别名为：用水类型名称WaterTypeName、附加费类型名称SurchargeName）

    private String fullname;//费用类型全称（主要用于附加费）

    private Double price;//    单价（元）

    private String surchargetext;//附加费征收范围说明文字（缓存，仅有参考意义）

    private String remark;// 备注

    private Boolean disabled;// 禁用 （0可使用 1已禁用）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCosttypename() {
        return costtypename;
    }

    public void setCosttypename(String costtypename) {
        this.costtypename = costtypename == null ? null : costtypename.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSurchargetext() {
        return surchargetext;
    }

    public void setSurchargetext(String surchargetext) {
        this.surchargetext = surchargetext == null ? null : surchargetext.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}