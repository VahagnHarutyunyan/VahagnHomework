package com.company.day20.task5;

public abstract class Animal {
    protected int age;
    protected static double d;
    protected abstract String animalRun();
    protected void voice() {
        System.out.println("Animal class' voice method");
    }
}
