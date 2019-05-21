package com.huarui.zls.pojo;
//抄表任务分配
public class RdTask {
    private Integer id;

    private Integer readyear;//抄表年份

    private Integer readmonth;//   抄表月份

    private Integer volumeid;//表册

    private Integer empid;//    责任抄表人

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

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}