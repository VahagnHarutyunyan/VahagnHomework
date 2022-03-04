package com.company.day21.task2;

public class Main {
    public static void main(String[] args) {

        Person one = new Person();
        System.out.println(one.area(10));
        System.out.println(one.area(1.5));

        Person person = new Baby();
        person.canSpeak();
    }

}
