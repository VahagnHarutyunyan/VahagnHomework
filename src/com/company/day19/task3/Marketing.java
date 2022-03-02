package com.company.day19.task3;

public class Marketing extends ItCompany {

    protected String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Marketing() {
    }

    public Marketing(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers);
        this.departmentName = departmentName;
    }

    protected String marketing() {
        return "Marketing class's marketing method";
    }
}
