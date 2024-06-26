package com.gopi.trainerInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Java2Joined")
public class Java extends Technical {
	String duration;
	int salary;
	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Java(int trainerId, String name, String city, String specification, String qualification) {
		super(trainerId, name, city, specification, qualification);
		// TODO Auto-generated constructor stub
	}
	public Java(int trainerId, String name, String city) {
		super(trainerId, name, city);
		// TODO Auto-generated constructor stub
	}
	public Java(int trainerId, String name, String city, String specification, String qualification, String duration,
			int salary) {
		super(trainerId, name, city, specification, qualification);
		this.duration = duration;
		this.salary = salary;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
