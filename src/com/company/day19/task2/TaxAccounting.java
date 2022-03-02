package com.company.day19.task2;

public class TaxAccounting extends Accounting {
    private int taxOfCompany;

    public int getTaxOfCompany() {
        return taxOfCompany;
    }

    public void setTaxOfCompany(int taxOfCompany) {
        this.taxOfCompany = taxOfCompany;
    }

    @Override
    protected String account() {
        return "TaxAccounting class's account method return taxOfCompany: " + taxOfCompany;
    }
}
