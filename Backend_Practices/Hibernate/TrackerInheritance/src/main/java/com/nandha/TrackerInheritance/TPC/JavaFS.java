package com.nandha.TrackerInheritance.TPC;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="JavaFS_tpc")
public class JavaFS extends Technical {
	
	
	String topics;
	String trainername;
	
	
	
	public JavaFS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaFS(int empid, String empname, String emprole, int marks) {
		super(empid, empname, emprole, marks);
		// TODO Auto-generated constructor stub
	}
	public JavaFS(int empid, String empname, String emprole) {
		super(empid, empname, emprole);
		// TODO Auto-generated constructor stub
	}
	
	
	public JavaFS(int empid, String empname, String emprole, int marks, String topics, String trainername) {
		super(empid, empname, emprole, marks);
		this.topics = topics;
		this.trainername = trainername;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	
	
	
}

