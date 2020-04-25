package com.learn.java.oop.inheritence;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this(); //calls the no arg constructor
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }

    public Animal() {
        System.out.println("constructed");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("I am eating...");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called I am moving at " + speed);
    }
}
