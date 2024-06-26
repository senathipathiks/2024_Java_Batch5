package com.ani.emp.service;

import java.util.List;

import com.ani.emp.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);

}
