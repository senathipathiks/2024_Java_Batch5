package com.employeepayroll.application.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeetable")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;
	private String name;
	private String department;
	private String designation;
	private String gender;

	@ManyToOne(targetEntity = Payroll.class, cascade = CascadeType.MERGE)
	private Payroll payroll;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, String designation, String gender, Payroll payroll) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.gender = gender;
		this.payroll = payroll;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", gender=" + gender + ", payroll=" + payroll + "]";
	}

}
