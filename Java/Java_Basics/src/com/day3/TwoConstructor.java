package com.day3;

class Person{
//	int age;
//	String name;
	
//	Person(int age,String name){
//		this.age=age;
//		this.name=name;
//		}
	
	Person(int age,String name){
			System.out.println("Age is: "+age);
			System.out.println("Name is: "+name);
	}
}

public class TwoConstructor {

	public static void main(String[] args) {
//		Person det = new Person(1,"Nagarjun");
//		System.out.println("Age is: "+det.age+" \n"+"Name is: "+det.name);
		
		Person det = new Person(23,"Nagarjun");
		
	}

}
