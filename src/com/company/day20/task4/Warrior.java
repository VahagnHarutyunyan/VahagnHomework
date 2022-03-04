package com.company.day20.task4;

public abstract class Warrior {
    protected int name;
    int nameNew;
    protected final double power = 12.5;
    protected static int health;
    static int healthNew;
    protected final static String type = "strong";

    abstract double hit(double energy);
}
