package com.subash.HibernatePracticeProblemTable_Per_Concrete;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Technical")
public class Technical extends Tracker {
	
	int courseId;
	String courseName;
	public Technical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technical(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}
	public Technical(int empId, String empName, String designation, int courseId, String courseName) {
		super(empId, empName, designation);
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
}
