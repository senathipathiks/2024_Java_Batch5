package com.day3;

import java.util.*;

class Employee2{
	
	private int empno;
	private String name;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee2 [empno=" + empno + ", name=" + name + ", getEmpno()=" + getEmpno() + ", getName()="
				+ getName() + "]";
	}
	
}


public class Emp2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 obj1=new Employee2();
		obj1.setEmpno(12216);
		obj1.setName("vidhu");
		System.out.println(obj1);
	
	}

}
