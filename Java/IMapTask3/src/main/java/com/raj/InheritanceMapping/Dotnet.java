package com.raj.InheritanceMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Dotnet2")
public class Dotnet extends Technical {
	String topics;
	String trainername;
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
	public Dotnet() {
		super();
	}
	public Dotnet(int empid, String empname, String role, int marks, String topics, String trainername) {
		super(empid, empname, role, marks);
		this.topics = topics;
		this.trainername = trainername;
	}
	
	
	
}
