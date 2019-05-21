package com.huarui.zls.pojo;

import java.util.Date;
//交票记录
public class IvArchive {
    private Integer id;

    private Integer empid;//交票人

    private Integer inid;//  对应入库ID

    private String startno;// 起始号码

    private String endno;//结束号码

    private Integer counts;//  总张数

    private Date archivedate;//交票日期

    private Integer archiveempid;//收票人

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

    public Date getArchivedate() {
        return archivedate;
    }

    public void setArchivedate(Date archivedate) {
        this.archivedate = archivedate;
    }

    public Integer getArchiveempid() {
        return archiveempid;
    }

    public void setArchiveempid(Integer archiveempid) {
        this.archiveempid = archiveempid;
    }
}