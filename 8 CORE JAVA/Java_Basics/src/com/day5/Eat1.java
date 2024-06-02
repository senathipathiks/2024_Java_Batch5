package com.day5;

interface Eatable {
    void eat();
}

class Animal implements Eatable {
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

public class Eat1{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();
    }
}
