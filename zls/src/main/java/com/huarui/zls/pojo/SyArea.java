package com.huarui.zls.pojo;
//抄表辖区
public class SyArea {
    private Integer id;

    private String areaname;//抄表辖区名称

    private String remark;//  备注

    private Boolean disabled;//   禁用 （0可使用 1已禁用）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
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

    @Override
    public String toString() {
        return "SyArea{" +
                "id=" + id +
                ", areaname='" + areaname + '\'' +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}