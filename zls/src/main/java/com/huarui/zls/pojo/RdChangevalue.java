package com.huarui.zls.pojo;

import java.util.Date;
//底码修正记录
public class RdChangevalue {
    private Integer id;

    private Date datee;//操作日期

    private Integer empid;//操作员

    private String userno;//用户编码

    private Integer prevalue1;//修正前底码

    private Integer prevalue2;//修正后底码

    private String remark;// 备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public Integer getPrevalue1() {
        return prevalue1;
    }

    public void setPrevalue1(Integer prevalue1) {
        this.prevalue1 = prevalue1;
    }

    public Integer getPrevalue2() {
        return prevalue2;
    }

    public void setPrevalue2(Integer prevalue2) {
        this.prevalue2 = prevalue2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}