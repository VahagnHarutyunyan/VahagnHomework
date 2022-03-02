package com.company.day19.task3;

public class SEO extends Marketing {
    public SEO() {
    }

    public SEO(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers, departmentName);
    }

    @Override
    protected String marketing() {
        return "SEO class's marketing method";
    }
}
