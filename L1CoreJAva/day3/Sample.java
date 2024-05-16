package com.day3;

class Employee1{
	private int id;
	private String Ename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
}
public class Sample {

	public static void main(String[] args) {

		Employee1 e = new Employee1();
		e.setId(122);
		e.setEname("vicky");
		System.out.println(e.getId()+":"+e.getEname());
		System.out.println(e);

	}

}
