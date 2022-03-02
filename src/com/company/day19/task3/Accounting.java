package com.company.day19.task3;

public class Accounting extends ItCompany {
    protected String departmentName;

    public Accounting() {
    }

    public Accounting(String companyName, String departmentName, int countOfEmployers) {
        super(companyName, countOfEmployers);
        this.departmentName = departmentName;
    }
}
