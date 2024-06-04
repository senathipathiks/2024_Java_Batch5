package com.day8;

//Constructor Invocation Order

class TwoWheeler6 {
	TwoWheeler6(){
		super();
		System.out.println("A");
}
	TwoWheeler6(int a){
		System.out.println("A 1");
	}
}

class Bike6 extends TwoWheeler6{
	Bike6(){
		System.out.println("B");
	}
	
	Bike6(int a){
		this();
//		super(5); //A1 B1
		System.out.println("B 1");
	}
}

public class ConstructorInvocationOrderEx {

	public static void main(String[] args) {
		Bike6 bike = new Bike6(5);

	}

}
