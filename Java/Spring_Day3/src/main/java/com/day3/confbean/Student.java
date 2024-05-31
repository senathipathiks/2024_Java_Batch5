package com.day3.confbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int rno;
	String name;
	
	@Autowired
	private Marks mark;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rno, String name, Marks mark) {
		super();
		this.rno = rno;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", mark=" + mark + "]";
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Marks getMark() {
		return mark;
	}

	public void setMark(Marks mark) {
		this.mark = mark;
	}
	
	public void display() {
		System.out.println("Id is: "+rno);
		System.out.println("Name is: "+name);
		System.out.println(mark);
	}
}
