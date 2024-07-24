package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int id);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int id);
	
}

