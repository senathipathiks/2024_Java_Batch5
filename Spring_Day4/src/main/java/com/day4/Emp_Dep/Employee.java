package com.day4.Emp_Dep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("12228")
	int Emp_id;
	@Value("Nagarjun N S")
	String Emp_name;
	@Value("O+ve")
	String Blood_group;
	
	@Autowired
	private Department dep;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, String blood_group, Department dep) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Blood_group = blood_group;
		this.dep = dep;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public String getBlood_group() {
		return Blood_group;
	}

	public void setBlood_group(String blood_group) {
		Blood_group = blood_group;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public void display() {
		System.out.println("Employee ID: "+Emp_id);
		System.out.println("Employee Name: "+Emp_name);
		System.out.println("Employee Blood_Group: "+Blood_group);
		System.out.println("Department ID: "+dep.dep_id);
		System.out.println("Department Name: "+dep.dep_name);
		System.out.println("Department Total Quantity: "+dep.quantity);
	}
}
