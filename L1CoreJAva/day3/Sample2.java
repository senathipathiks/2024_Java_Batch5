package com.day3;

class Relevantz{
	private int id;
	private String name;
	Relevantz(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}

}
class Manager extends Relevantz{
	String dep;
	Manager(int id,String name,String dep)
	{
		super(id,name);
		this.dep=dep;
	}
	void display() {
		super.display();
		System.out.println("Department: "+dep);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Manager m = new Manager(12,"vicky","Intern");
		m.display();

	}

}
