package com.emppayroll.restapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmplPay")
public class EmpPay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_id")
	private int id;
	
	@Column(name = "Emp_Name")
	private String name;
	
	@Column(name = "Emp_City")
	private String city;
	
	@Column(name = "Emp_mobile")
	private long mobile;
	
	@Column(name = "Emp_Designation")
	private String dept;
	
	@ManyToOne(targetEntity=Salary.class, cascade = CascadeType.MERGE)
	@JoinColumn
	private Salary salary;
	
	
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public EmpPay() {
		super();
		
	}

	

	public EmpPay(int id, String name, String city, long mobile, String dept, Salary salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.dept = dept;
		this.salary = salary;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpPay [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}

	
	
	
	
}
