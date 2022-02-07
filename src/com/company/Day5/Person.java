package com.company.Day5;
/*
Has  fields name, age, address
 define no argument constructor
 define all argument constructor
 write method which will print all information about person
 create 2 person objects, print all info about them
 */
public class Person {
    String name;
    int age;
    String address;
    Person(){}
    public Person(String a, int b, String c) {
        name = a;
        age = b;
        address = c;
    }
    public void printPerson() {
        System.out.println("Person name: " + name + " Person age: " + age + " Person address: " + address);
    }
}
