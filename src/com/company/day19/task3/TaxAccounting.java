package com.company.day19.task3;

public class TaxAccounting extends Accounting {
    public TaxAccounting() {
    }

    public TaxAccounting(String companyName, String departmentName, int countOfEmployers) {
        super(companyName, departmentName, countOfEmployers);
    }

    @Override
    protected String account() {
        return "TaxAccount class's account method";
    }
}
