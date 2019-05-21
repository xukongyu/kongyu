package com.huarui.zls.pojo;
//分类水量
public class RdReadtypes {
    private Integer id;

    private Integer readid;//抄表ID

    private String userno;//用户编码

    private String watertypecode;//   用水类型代码（其实就是费用类型）

    private String allottext;//   提取值表述（仅供参考，如：80%）

    private Integer amount;// 分量水量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadid() {
        return readid;
    }

    public void setReadid(Integer readid) {
        this.readid = readid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getWatertypecode() {
        return watertypecode;
    }

    public void setWatertypecode(String watertypecode) {
        this.watertypecode = watertypecode == null ? null : watertypecode.trim();
    }

    public String getAllottext() {
        return allottext;
    }

    public void setAllottext(String allottext) {
        this.allottext = allottext == null ? null : allottext.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}