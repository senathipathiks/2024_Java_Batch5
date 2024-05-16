package com.day3;

class employee{
	
	int eno;
	String name;
	static int count;
	employee(int eno, String name){
		this.eno=eno;
		this.name=name;
	}
	
	static int increment() {
		return count++;
	}
	
	void display() {
		System.out.println(eno+":"+name);
	}
}
public class ClassEg {

	public static void main(String[] args) {
		
		employee e = new employee(12206,"vicky");
		System.out.println(employee.increment());
		e.display();
		
		employee e1 = new employee(12207,"mee");
		System.out.println(employee.increment());
		e1.display();
		
		employee e2 = new employee(122011,"ara");
		System.out.println(employee.increment());
		e2.display();
	}

}
