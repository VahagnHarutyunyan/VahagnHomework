package com.company.day19.task2;

public class Accounting {
    protected int countOfEmployers;
    protected String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    protected String account() {
        return "Accounting class's account method";
    }
}
