package com.day3;
class Emp
{
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
	private int rollno;
	private String name;
	@Override
	public String toString() {
		return "Emp [rollno=" + rollno + ", name=" + name + ", getRollno()=" + getRollno() + ", getName()=" + getName()
				+ "]";
	}
	
}
public class Day3_2 {

	public static void main(String[] args) {
		
		Emp obj1 =new Emp();
		obj1.setName("Ani");
		obj1.setRollno(121);
		System.out.println(obj1);

	}

}
