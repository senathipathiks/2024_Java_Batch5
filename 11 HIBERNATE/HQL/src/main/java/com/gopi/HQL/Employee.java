package com.gopi.HQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Branch=" + Branch + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	int Branch;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int branch) {
		super();
		this.id = id;
		this.name = name;
		Branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBranch() {
		return Branch;
	}
	public void setBranch(int branch) {
		Branch = branch;
	}
	
	
}
