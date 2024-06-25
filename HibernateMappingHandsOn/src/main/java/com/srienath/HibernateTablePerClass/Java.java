package com.srienath.HibernateTablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Java2")

public class Java extends Technical {
	
	int topics;
	@Column(name="tname")
	String trainerName;
	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Java(int empId, String empName, String designation, int ttid, String tcname) {
		super(empId, empName, designation, ttid, tcname);
		// TODO Auto-generated constructor stub
	}
	public Java(int empId, String empName, String designation) {
		super(empId, empName, designation);
		// TODO Auto-generated constructor stub
	}
	public Java(int empId, String empName, String designation, int ttid, String tcname, int topics,
			String trainerName) {
		super(empId, empName, designation, ttid, tcname);
		this.topics = topics;
		this.trainerName = trainerName;
	}
	public int getTopics() {
		return topics;
	}
	public void setTopics(int topics) {
		this.topics = topics;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
}