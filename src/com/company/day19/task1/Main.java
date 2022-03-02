package com.company.day19.task1;

public class Main {
    public static void main(String[] args) {
        Animal dinosaur = new Animal();
        System.out.println(dinosaur.voice() + " " + dinosaur.eat());

        Animal wolfy = new Dog();
        System.out.println(wolfy.voice() + " " + wolfy.eat());

        Dog beethoven = new Dog();
        System.out.println(beethoven.voice() + " " + beethoven.eat());
    }
}
