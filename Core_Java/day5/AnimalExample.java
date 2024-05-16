package com.day5;

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("Animal walks by using "+legs+"Legs");
	}
}

interface Pet{
	void getName();
	void setName(String name);
	void play();
}

class Spider extends Animal{
	Spider(int legs){
		super(legs);
	}
	void eat() {
		System.out.println("Spider eat snails");
	}
}

class Cat extends Animal implements Pet{
	String name;
	Cat(String name){
		this.name = name;
	}
	Cat(){
		this("");
	}
	public void getName() {
		System.out.println("Name= "+name);
	}
	public void setName(String Name) {
		this.name = name;
	}
	void eat() {
		System.out.println("cat eats mammals");
	}
	public void play() {
		System.out.println("Cat play with dogs and balls");
	}
	
}

class Fish extends Animal{
	Fish(){
		System.out.println("Fish");
	}
	void eat() {
		System.out.println("Fish eats samll fish and earth warm");
	}
	void walk() {
		System.out.println("Fish can't walk");
	}
	void play() {
		System.out.println("Fish play with small fishes");
	}
	
}
public class AnimalExample {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a;
		a = new Fish();
		a = new Spider(8);
		Pet p = new Cat();

	}

}
