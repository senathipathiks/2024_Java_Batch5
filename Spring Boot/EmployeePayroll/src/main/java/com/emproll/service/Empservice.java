package com.emproll.service;

import java.util.List;

import com.emproll.model.Employee;

public interface Empservice {
	public void addemp(Employee emp);
	public Employee getEmp(int id);
	public void delEmp(int id);
	public List<Employee> viewAllEmp();
	public void upEmp(Employee emp);
}
