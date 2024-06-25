package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee emp);
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(int id);

}
