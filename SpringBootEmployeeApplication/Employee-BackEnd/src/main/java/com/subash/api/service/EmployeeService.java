package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public void addEmployees(List<Employee> emp);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(int id);
}
