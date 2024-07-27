package com.SpringBoot.Eg7.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "emp_tbl")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column
	private String empname;
	@Column
	private String designation;
	@Column
	private String department;
	
	@OneToOne(targetEntity = Salary.class, cascade = CascadeType.ALL)
	private Salary salary;
	
	public Employee() 
	{
		super();
	}

	public Employee(int empid, String empname, String designation, String department, Salary salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}	
}
