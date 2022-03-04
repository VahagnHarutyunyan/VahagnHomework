package com.company.day21.task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animalCat = new Cat();
        Cat cat = new Cat();

        animal.sound();
        animalCat.sound();
        cat.sound();

        System.out.println("////////////////////////////////////////////");
        System.out.println(animal);
        System.out.println(animalCat);
        System.out.println(cat);
        System.out.println("--------------------------------------------");

        animal.setAge(1);
        animal.setName("a");
        cat.setAge(2);
        cat.setName("b");
        System.out.println(animal);
        System.out.println(cat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        animalCat.setAge(100);
        animalCat.setName("pinguin");
        System.out.println(animal);
        System.out.println(cat);
        System.out.println(animalCat);

    }
}
