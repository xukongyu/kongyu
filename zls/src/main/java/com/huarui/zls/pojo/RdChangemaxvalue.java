package com.huarui.zls.pojo;

import java.util.Date;
//最大表码修正记录
public class RdChangemaxvalue {
    private Integer id;

    private Date datee;//操作日期

    private Integer empid;//   操作员

    private String userno;//       用户编码

    private String meterno;// 水表编码

    private Integer maxvalue1;//修正前最大表码值

    private Integer maxvalue2;//修正后最大表码值

    private String remark;//备注


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

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno == null ? null : meterno.trim();
    }

    public Integer getMaxvalue1() {
        return maxvalue1;
    }

    public void setMaxvalue1(Integer maxvalue1) {
        this.maxvalue1 = maxvalue1;
    }

    public Integer getMaxvalue2() {
        return maxvalue2;
    }

    public void setMaxvalue2(Integer maxvalue2) {
        this.maxvalue2 = maxvalue2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}