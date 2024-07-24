package com.aravind.HQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="em")
public class Employee1 {
	@Id
	@Column(name="ename")
	String name;
	
	@Column
	int batch;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(String name, int batch) {
		super();
		this.name = name;
		this.batch = batch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", batch=" + batch + "]";
	}
	
	
	
	
	
	

}
