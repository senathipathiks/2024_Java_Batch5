package com.prabha.SpringDay2;

public class Students {
	int studentid;
	String studentname;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + "]";
	}

	public Students(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

}
