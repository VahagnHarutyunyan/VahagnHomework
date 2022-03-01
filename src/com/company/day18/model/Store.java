package com.company.day18.model;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] product;

    public Store() {
    }

    public Store(int countOfWorkers, String name, String phoneNumber, String[] product) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.product = product;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }
}
