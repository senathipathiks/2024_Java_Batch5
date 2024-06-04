package com.gana.Spring;

public class Student {

	int stuid;
	String studname;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuid , String studname) {
		super();
		this.studname = studname;
		this.stuid = stuid;
	}
	public String toString() {
		return "Computer [id = "+ stuid +", name = "+ studname +"]";
		
	}

}
