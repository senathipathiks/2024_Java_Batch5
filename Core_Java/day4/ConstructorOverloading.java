package com.day4;

public class ConstructorOverloading {
	int rollno;
	String name;
	ConstructorOverloading(){
		rollno = 0;
		name = " ";
	}
	ConstructorOverloading(int r){
		rollno =r ;
		name = "Relevantz";
	}
	ConstructorOverloading(int r, String n){
		rollno = r;
		name = n;
	}
	public static void main(String args[]) {
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading(5);
		ConstructorOverloading c2 = new ConstructorOverloading(19,"Aravind");
		
	}

}
