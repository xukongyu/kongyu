package com.huarui.zls.pojo;
//员工菜单权限
public class SyEmpmenupower {
    private Integer id;

    private Integer empid;//员工ID



    private Integer menuid;// 菜单ID

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

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }
}