package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Employee;

public interface EmpService {
	

	public void addEmployee(Employee employee);
	public Employee getEmployee(int eid);
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int eid);

}
