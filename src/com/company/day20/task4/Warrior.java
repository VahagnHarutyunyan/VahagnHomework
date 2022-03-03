package com.company.day20.task4;

public abstract class Warrior {
    int name;
    final double power = 12.5;
    static int health;
    public final static String type = "strong";

    abstract double hit(double energy);
}
