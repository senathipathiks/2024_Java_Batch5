package com.springboot.eg12.service;

import java.util.List;

import com.springboot.eg12.model.Employee;

public interface EmployeeService 
{
	public void addEmployee(Employee employee);
	 
	public List<Employee> getallEmployees();

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int emp_id);
	
	public Employee findEmployeeById(int emp_id);
}
