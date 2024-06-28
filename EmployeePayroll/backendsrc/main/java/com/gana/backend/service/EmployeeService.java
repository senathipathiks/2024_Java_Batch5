package com.gana.backend.service;

import java.util.List;

import com.gana.backend.model.Employee;

public interface EmployeeService {
	
public void addEmployee(Employee employee);
	
	public Employee getEmployee(int empid);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int empid);


}
