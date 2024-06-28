package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Employee;

public interface EmployeeService {
	public void addStudent(Employee emp);  //insert
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int id);
}
