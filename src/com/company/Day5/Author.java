package com.company.Day5;

/*
Define Author class which
 Has  fields name, email, gender
 define all argument constructor
 write method which will print all information about Author
 create an instance of Author and print all info about him
 */
public class Author {
    String name;
    String email;
    Gender gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void printAuthor() {
        System.out.println("Author name: " + name + " Author email: " + email + " Author gender " + gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
