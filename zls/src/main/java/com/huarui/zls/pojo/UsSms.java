package com.huarui.zls.pojo;

import java.util.Date;
//短信群发记录
public class UsSms {
    private Integer id;

    private Date sendtime;//发送时间





    private Integer empid;//    操作人

    private String message;//  发送内容

    private Integer typee;//发送类型（0给所有用户发 1只给欠费用户发）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }
}