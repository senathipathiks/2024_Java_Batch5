package com.day5;

interface Pet {
    void play();
}

class Dog implements Pet {
    public void play() {
        System.out.println("The dog plays with its owner.");
    }

    public static void main(String args[]) {
        Pet pet = new Dog();
        pet.play();
    }
}
