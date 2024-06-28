package com.madhan.restapp.model;

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
@Table(name="emp table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id; 
	@Column
	private String name;
	@Column
	private String dept;
	@Column
	private String desig;
	@Column
	private String city;
	
	@OneToOne(targetEntity = Payroll.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "payroll")
	private Payroll payroll;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String dept, String desig, String city, Payroll payroll) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.city = city;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
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
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", city=" + city
				+ ", payroll=" + payroll + "]";
	}
	
	
	
}
