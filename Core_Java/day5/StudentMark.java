package com.day5;
//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

abstract class Mark{
	abstract float getPercentage();
}

class A extends Mark{
	int m1,m2,m3,mark;
	float p;
	A(int m1, int m2, int m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	float getPercentage() {
		mark = m1+m2+m3;
	    p = ((float)mark/300)*100;
		return p;
	}
	
}

class B extends Mark{
	int m1,m2,m3,m4,mark;
	float p;
	B(int m1, int m2, int m3, int m4){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	float getPercentage() {
		mark = m1+m2+m3+m4;
		 p = ((float)mark/400)*100;
		return p;
		
	}
}
public class StudentMark {

	public static void main(String[] args) {
		Mark m;
		m = new B(99,95,94,80);
		System.out.println("A's Percentage = "+m.getPercentage());
		m = new A(90,80,77);
		System.out.println("B's Percentage = "+m.getPercentage());

	}

}
