package com.emproll.service;

import java.util.List;

import com.emproll.model.Employee;

public interface Empservice {
	public String addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int id);
}
