package com.huarui.zls.pojo;

import java.util.Date;
//抄表年月
public class RdYearmonth {
    private Integer id;

    private Integer readyear;//抄表年份

    private Integer readmonth;//抄表月份

    private Boolean iscurrent;//当前

    private Integer initempid;// 初始化操作人

    private Date initdate;//初始化时间

    private Date enddate;//  结束时间

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

    public Boolean getIscurrent() {
        return iscurrent;
    }

    public void setIscurrent(Boolean iscurrent) {
        this.iscurrent = iscurrent;
    }

    public Integer getInitempid() {
        return initempid;
    }

    public void setInitempid(Integer initempid) {
        this.initempid = initempid;
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initdate) {
        this.initdate = initdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}