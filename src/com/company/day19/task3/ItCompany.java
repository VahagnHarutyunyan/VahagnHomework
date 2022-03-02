package com.company.day19.task3;

public class ItCompany {
    protected int countOfEmployers;
    protected String companyName;

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ItCompany() {
    }

    public ItCompany(String companyName, int countOfEmployers ) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    protected String account () {
        return "ItCompany class's account method";
    }
}
