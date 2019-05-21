package com.huarui.zls.pojo;
//菜单
public class SyMenu {
    private Integer id;

    private String menuname;//菜单名称

    private Integer parent;//  菜单上级ID

    private String url;//菜单链接的URL

    private String onclikc;//    菜单点击时的js代码

    private String icon;//菜单图标对应的样式类

    private Integer orderindex;// 菜单排序号

    private Integer flowid;//此菜单项对应业扩流程中的流程ID



    private Boolean disabled;//    禁用 （0可使用 1已禁用）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOnclikc() {
        return onclikc;
    }

    public void setOnclikc(String onclikc) {
        this.onclikc = onclikc == null ? null : onclikc.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "SyMenu{" +
                "id=" + id +
                ", menuname='" + menuname + '\'' +
                ", parent=" + parent +
                ", url='" + url + '\'' +
                ", onclikc='" + onclikc + '\'' +
                ", icon='" + icon + '\'' +
                ", orderindex=" + orderindex +
                ", flowid=" + flowid +
                ", disabled=" + disabled +
                '}';
    }
}