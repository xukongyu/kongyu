package com.huarui.zls.pojo;

import java.util.Date;
//发票出库
public class IvOutinvoice {
    private Integer id;

    private Integer empid;//领用人

    private Integer inid;//对应入库ID

    private String startno;// 起始号码

    private String endno;//  结束号码

    private Integer counts;//总张数

    private Date outdate;//出库日期

    private Integer outempid;//出库操作人

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

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getStartno() {
        return startno;
    }

    public void setStartno(String startno) {
        this.startno = startno == null ? null : startno.trim();
    }

    public String getEndno() {
        return endno;
    }

    public void setEndno(String endno) {
        this.endno = endno == null ? null : endno.trim();
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public Integer getOutempid() {
        return outempid;
    }

    public void setOutempid(Integer outempid) {
        this.outempid = outempid;
    }
}