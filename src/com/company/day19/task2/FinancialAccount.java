package com.company.day19.task2;

public class FinancialAccount extends TaxAccounting {
    private  int salryOfEployeers;

    public int getSalryOfEployeers() {
        return salryOfEployeers;
    }

    public void setSalryOfEployeers(int salryOfEployeers) {
        this.salryOfEployeers = salryOfEployeers;
    }

    @Override
    protected String account() {
        return "FinancialAccount class's account method return salryOfEployeers: " + salryOfEployeers;
    }
}
