package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee emp);


	public Employee getEmployee(int id);


	public List<Employee> getAllEmployee();


	public void updateEmployee(Employee emp);


	public void deleteEmployee(int id);
}
