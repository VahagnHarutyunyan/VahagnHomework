package com.company.day19.task1;

public class Dog extends Animal {
    @Override
    protected String voice() {
        return "dog voice";
    }

    @Override
    protected String eat() {
        return "dog eat";
    }
}
