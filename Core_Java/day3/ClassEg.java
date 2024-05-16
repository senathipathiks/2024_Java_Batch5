package com.day3;

class Employees {
	private int rollno; // achieve encapuslation
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class ClassEg{

	public static void main(String[] args) {
		Employees e = new Employees();
		e.setName("Aravind");
		e.setRollno(12219);
		System.out.println(e.getRollno()+":"+e.getName());
		System.out.println(e);
		
		

	}

}
