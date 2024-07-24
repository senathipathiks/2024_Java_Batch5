package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int id);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	
}

