package com.day3;

class sample{
	private String name;
	private int age;
	
	sample(String name,int age){
		this.age= age;
		this.name = name;
	}
	void display() {
		System.out.println("The person name is : "+name);
		System.out.println("The person age is : "+age);
	}
}
	
class person_sch extends sample{
	private String sch_name;
	private int sch_mark;
	person_sch(String name, int age,String sch_name,int sch_mark) {
		super(name, age);
		this.sch_mark = sch_mark;
		this.sch_name = sch_name;
	}
	void display() {
		super.display();
		
		System.out.println("The person School name is : "+sch_name);
		System.out.println("The person School mark is : "+sch_mark);
		System.out.println();
	}
		
}

class person_clg extends sample{
	private String clg_name;
	private double clg_cgpa;
	person_clg(String name, int age,String clg_name,double clg_cgpa) {
		super(name, age);
		this.clg_cgpa = clg_cgpa;
		this.clg_name = clg_name;
	}
	void display() {
		super.display();
		System.out.println("The person College name is : "+clg_name);
		System.out.println("The person College CGPA is : "+clg_cgpa);
		System.out.println();
	}
		
}

public class Person {

	public static void main(String[] args) {
		person_clg p1 = new person_clg("Gopi", 20, "KVSHSS", 450);
		p1.display();
		
		person_clg p2 = new person_clg("Gopi", 20, "KCET", 8.7);
		p2.display();

	}

}
