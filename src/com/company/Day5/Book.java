package com.company.Day5;
/*
Define Book class which
 Has  fields name, author, price
 define all argument constructor
 write method which will print all information about Book
 write methods which will print name and email of the author
 create 2 instances of Book, which has same author
 print all info about books
 */
public class Book {
    String name;
    Author author;
    double price;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public void printBook() {
        System.out.println("book name: " + name + "book Author " + author + " book price " + price);
    }
    public void printAuthorName() {
        System.out.println("Author name is: " + author.name);
    }
    public void printAuthorEmail() {
        System.out.println("Author email is: " + author.email);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}
