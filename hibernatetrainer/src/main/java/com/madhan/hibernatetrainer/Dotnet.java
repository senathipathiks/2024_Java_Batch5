package com.madhan.hibernatetrainer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dotnet")
public class Dotnet extends Technical {
	int marks;

	public Dotnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String experience, String qualification, String specification) {
		super(trainerid, trainername, experience, qualification, specification);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String experience) {
		super(trainerid, trainername, experience);
		// TODO Auto-generated constructor stub
	}

	public Dotnet(int trainerid, String trainername, String experience, String qualification, String specification,
			int marks) {
		super(trainerid, trainername, experience, qualification, specification);
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
