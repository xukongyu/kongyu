package com.huarui.zls.pojo;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:08 2019/4/4
 * @ Description:员工和部门关联实体类
 */
public class SyEmpandDept extends  SyEmp{
    private String deptname;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
