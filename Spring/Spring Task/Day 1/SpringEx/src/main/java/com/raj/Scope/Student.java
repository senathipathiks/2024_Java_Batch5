package com.raj.Scope;

public class Student {
	private int Student_id;
	private String student_name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_id, String student_name) {
		super();
		Student_id = student_id;
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", student_name=" + student_name + "]";
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	
	
}
