package com.huarui.zls.pojo;
//附加费关联
public class SySurcharge {
    private Integer id;

    private Integer surchargeid;//附加费ID（其实就是费用类型ID）


    private Integer watertypeid;//    用水类型ID（其实就是费用类型ID）


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSurchargeid() {
        return surchargeid;
    }

    public void setSurchargeid(Integer surchargeid) {
        this.surchargeid = surchargeid;
    }

    public Integer getWatertypeid() {
        return watertypeid;
    }

    public void setWatertypeid(Integer watertypeid) {
        this.watertypeid = watertypeid;
    }
}