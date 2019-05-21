package com.huarui.zls.pojo;
//各类用水统计总表
public class PySumreport {
    private Integer id;

    private Integer typee;//类型（0月报表  1年报表）






    private Integer reportyear;//年份

    private Integer reportmonth;// 月份（只有月报表才有值）

    private Integer lineno;// 行号

    private String c1;// 第一列

    private String c2;//第二列


    private String c3;//第三列

    private String c4;//第四列

    private String c5;//    第五列

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }

    public Integer getReportyear() {
        return reportyear;
    }

    public void setReportyear(Integer reportyear) {
        this.reportyear = reportyear;
    }

    public Integer getReportmonth() {
        return reportmonth;
    }

    public void setReportmonth(Integer reportmonth) {
        this.reportmonth = reportmonth;
    }

    public Integer getLineno() {
        return lineno;
    }

    public void setLineno(Integer lineno) {
        this.lineno = lineno;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1 == null ? null : c1.trim();
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2 == null ? null : c2.trim();
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3 == null ? null : c3.trim();
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4 == null ? null : c4.trim();
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5 == null ? null : c5.trim();
    }
}