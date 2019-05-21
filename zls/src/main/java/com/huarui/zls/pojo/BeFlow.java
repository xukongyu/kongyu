package com.huarui.zls.pojo;
//流程模板
public class BeFlow {
    private Integer id;

    private String stepname;//步骤名称

    private Integer deptid;//步骤负责部门

    private Integer type1;//“新户”的流程

    private Integer type2;//“分户”的流程

    private Integer type3;//“过户”的流程

    private Integer type4;//“代扣”的流程

    private Integer type5;//“换表”的流程

    private Integer type6;//“重签”的流程

    private Integer type7;//“销户”的流程

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getType3() {
        return type3;
    }

    public void setType3(Integer type3) {
        this.type3 = type3;
    }

    public Integer getType4() {
        return type4;
    }

    public void setType4(Integer type4) {
        this.type4 = type4;
    }

    public Integer getType5() {
        return type5;
    }

    public void setType5(Integer type5) {
        this.type5 = type5;
    }

    public Integer getType6() {
        return type6;
    }

    public void setType6(Integer type6) {
        this.type6 = type6;
    }

    public Integer getType7() {
        return type7;
    }

    public void setType7(Integer type7) {
        this.type7 = type7;
    }
}