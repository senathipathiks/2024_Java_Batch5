package com.gopi.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee-RestAPI")
public class Employee {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int empid;
	@Column
	private String empname;
	@Column
	private String department;
	@Column
	private String roll;
	@Column
	private String city;
	@OneToOne(targetEntity = Payroll.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "payroll")
	private Payroll payroll;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, String department, String roll, String city, Payroll payroll) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.roll = roll;
		this.city = city;
		this.payroll = payroll;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getempname() {
		return empname;
	}
	public void setempname(String empname) {
		this.empname = empname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Payroll getPayroll() {
		return payroll;
	}
	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", department=" + department + ", roll=" + roll
				+ ", city=" + city + ", payroll=" + payroll + "]";
	}
	
}
