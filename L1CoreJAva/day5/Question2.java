package com.day5;

class Animal{
	int legs;
	Animal(int legs){
		legs =legs;
	}
	}
class Spider extends Animal{
	Spider(){
		super(legs);
	}
	void display() {
		System.out.println("Spider has 8 legs");
	}
	
}
public class Question2 {

	public static void main(String[] args) {
		Spider s = new Spider();
		s.display();
		
	}

}
