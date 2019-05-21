package com.huarui.zls.pojo;

import java.util.Date;
//发票入库
public class IvIninvoice {
    private Integer id;

    private Integer invoicetype;//发票类型（0普通发票 1增值税发票）

    private String startno;//  开始号码

    private String endno;// 结束号码

    private Integer counts;//总张数

    private Date indate;//入库时间

    private Integer inempid;//入库操作人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
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

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Integer getInempid() {
        return inempid;
    }

    public void setInempid(Integer inempid) {
        this.inempid = inempid;
    }
}