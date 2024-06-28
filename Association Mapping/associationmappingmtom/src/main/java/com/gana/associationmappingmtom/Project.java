package com.gana.associationmappingmtom;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.gana.associationmappingmtom.Employee;

@Entity
@Table(name = "project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String name;
	
	@ManyToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
	private java.util.List<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String name, List<Employee> employee) {
		super();
		this.pid = pid;
		this.name = name;
		this.employee = employee;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
