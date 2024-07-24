package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Employee;

public interface EmpService {
	

	public String addEmployee(Employee employee);
	public Employee getEmployee(int eid);
	public List<Employee> getAllEmployees();
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int eid);

}
