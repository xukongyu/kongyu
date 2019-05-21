package com.huarui.zls.pojo;
//水表型号
public class SyMetertype {
    private Integer id;

    private String metertypename;//水表型号名称

    private Integer aperture;//口径

    private Integer mavvalue;//最大表码值（吨。此种水表的默认最大表码值）

    private Integer minvalue;//下限设置（吨。仅供参考，不做实际用途）

    private Integer life;//周检年限（月）

    private String remark;//备注

    private Boolean disabled;//   禁用 （0可使用 1已禁用）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetertypename() {
        return metertypename;
    }

    public void setMetertypename(String metertypename) {
        this.metertypename = metertypename == null ? null : metertypename.trim();
    }

    public Integer getAperture() {
        return aperture;
    }

    public void setAperture(Integer aperture) {
        this.aperture = aperture;
    }

    public Integer getMavvalue() {
        return mavvalue;
    }

    public void setMavvalue(Integer mavvalue) {
        this.mavvalue = mavvalue;
    }

    public Integer getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(Integer minvalue) {
        this.minvalue = minvalue;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}