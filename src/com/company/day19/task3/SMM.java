package com.company.day19.task3;

public class SMM extends Marketing {

    public SMM() {
    }

    public SMM(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers, departmentName);
    }

    @Override
    protected String marketing() {
        return "SMM class's marketing method";
    }
}
