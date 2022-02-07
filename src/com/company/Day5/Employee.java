package com.company.Day5;
/*
Define Employee class which
 Has  fields id, name, department, age, gender
 define all argument constructor
 write method which will print all information about employee
 create 5 employee objects(3 male and 2 female)
 3 of them are working in same department
 print all info about them
 */
public class Employee {
    Long id;
    String name;
    String department;
    int age;
    Gender gender;

    public Employee(Long id, String name, String department, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
