package com.huarui.zls.pojo;

import java.util.Date;
//发票
public class IvInvoice {
    private String invoiceno;//发票号码（一般是8位。批量收费时是10位，前8位相同，后2位是流水号。）

    private Integer invoicetype;//发票类型（0普通发票 1增值税发票）

    private Integer empid;//   领用收费员

    private Integer inid;//入库批次ID

    private Integer outid;//出库批次ID

    private Integer archiveid;// 交票批次ID

    private Boolean used;//已使用

    private Date usedate;//使用日期

    private Boolean invalid;//已作废

    private Date invaliddate;//作废日期

    private Boolean archived;//已交票

    private Date archivedate;//交票日期

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
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

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Integer getArchiveid() {
        return archiveid;
    }

    public void setArchiveid(Integer archiveid) {
        this.archiveid = archiveid;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Date getInvaliddate() {
        return invaliddate;
    }

    public void setInvaliddate(Date invaliddate) {
        this.invaliddate = invaliddate;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Date getArchivedate() {
        return archivedate;
    }

    public void setArchivedate(Date archivedate) {
        this.archivedate = archivedate;
    }

    public IvInvoice(String invoiceno, Integer invoicetype, Integer empid, Integer inid, Integer outid, Integer archiveid, Boolean used, Date usedate, Boolean invalid, Date invaliddate, Boolean archived, Date archivedate) {
        this.invoiceno = invoiceno;
        this.invoicetype = invoicetype;
        this.empid = empid;
        this.inid = inid;
        this.outid = outid;
        this.archiveid = archiveid;
        this.used = used;
        this.usedate = usedate;
        this.invalid = invalid;
        this.invaliddate = invaliddate;
        this.archived = archived;
        this.archivedate = archivedate;
    }
}