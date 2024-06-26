package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee emp);
	Employee getEmployee(int id);
	List<Employee> getAllEmployees();
	void updateEmployee(Employee emp);
	void deleteEmployee(int id);
}
