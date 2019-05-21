package com.huarui.zls.pojo;

import java.util.Date;
//流程历史记录
public class BeHistory {
    private Integer id;

    private String orderno;//工单号

    private Integer stepid;//步骤ID

    private Date datee;//处理时间

    private Integer empid;//处理人

    private Boolean isback;//被撤回

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
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

    public Boolean getIsback() {
        return isback;
    }

    public void setIsback(Boolean isback) {
        this.isback = isback;
    }
}