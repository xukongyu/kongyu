package com.huarui.zls.pojo;
//员工辖区权限
public class SyEmpareapower {
    private Integer id;

    private Integer empid;//员工ID

    private Integer areaid;//    抄表辖区ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }
}