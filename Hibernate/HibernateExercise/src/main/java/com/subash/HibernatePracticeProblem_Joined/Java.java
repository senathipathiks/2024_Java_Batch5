package com.subash.HibernatePracticeProblem_Joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Java")
public class Java extends Technical {
	
	String trainerName;

	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Java(int empId, String empName, String designation, int courseId, String courseName) {
		super(empId, empName, designation, courseId, courseName);
		// TODO Auto-generated constructor stub
	}

	public Java(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}

	public Java(int empId, String empName, String designation, int courseId, String courseName, String trainerName) {
		super(empId, empName, designation, courseId, courseName);
		this.trainerName = trainerName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
}
