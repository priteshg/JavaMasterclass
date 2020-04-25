package com.learn.java.oop.inheritence;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 8, 20, 3, 4);
        Dog dog = new Dog("Yorkie", 8, 20, 3, 4, 1, 5, 20, 2, "silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
