package com.company.day19.task3;

public class FinancialAccount extends TaxAccounting {
    public FinancialAccount() {
    }

    public FinancialAccount(String companyName, String departmentName, int countOfEmployers) {
        super(companyName, departmentName, countOfEmployers);
    }

    @Override
    protected String account() {
        return "FinancialAccount class's account method";
    }
}
