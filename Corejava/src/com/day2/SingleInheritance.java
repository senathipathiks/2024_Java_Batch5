package com.day2;

class New
{
	private int rollno;
	private String name;
	New(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
}
	void display()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}
}
class Manager extends New
{
	String dept;
	Manager(int rollno,String name,String dept)
	{
		super(rollno,name);
		this.dept = dept;
	}
	void display() {
		super.display();
		System.out.println("Dept:"+dept);
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Manager m = new Manager(101,"gg","ggghg");
		m.display();
	}

}
