package com.aravind.micro.service;

import java.util.List;

import com.aravind.micro.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public Employee getEmployee(int eid);
	public List<Employee> getAllEmployee();
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int eid);


}
