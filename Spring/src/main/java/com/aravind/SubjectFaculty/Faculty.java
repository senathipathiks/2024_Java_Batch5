package com.aravind.SubjectFaculty;

import org.springframework.beans.factory.annotation.Autowired;

public class Faculty {
	int facultyId;
	String facultyName;
	
	@Autowired
	Subject sub;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int facultyId, String facultyName) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", sub=" + sub + "]";
	}
	

}
