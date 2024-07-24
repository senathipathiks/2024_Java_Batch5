package com.nandha.Scope;

public class Student {
	
	private int stuId;
	private String stuName;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
