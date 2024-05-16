package com.day3;

class A{
	A(){
		System.out.println("Class A");
	}
	A(int x){
		System.out.println("class A-1");
	}
}
class B extends A{
	B(){
		System.out.println("Class B");
	}
	B(int x){
		System.out.println("class B-1");
	}
}
class C extends B{
	C(){
		//jvm automatically call base class cons
		System.out.println("Class C");
	}
	C(int x){
		//jvm 
		super(5);
		System.out.println("class c-1");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		C obj = new C(5);
		

	}

}
