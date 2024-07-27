package com.springboot.eg10.service;

import java.util.List;

import com.springboot.eg10.model.Employee;

public interface EmployeeService 
{
	public String addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(int id);
}
