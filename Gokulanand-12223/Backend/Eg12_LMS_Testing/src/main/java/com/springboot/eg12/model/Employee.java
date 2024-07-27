package com.springboot.eg12.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "employee")
public class Employee 
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String emp_name;
	private int days;
	private String reason;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn
	private Admin admin;
	
	public Employee() 
	{
		super();
	}

	public Employee(int emp_id, String emp_name, int days, String reason, Admin admin) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.days = days;
		this.reason = reason;
		this.admin = admin;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", days=" + days + ", reason=" + reason
				+ ", admin=" + admin + "]";
	}
}
