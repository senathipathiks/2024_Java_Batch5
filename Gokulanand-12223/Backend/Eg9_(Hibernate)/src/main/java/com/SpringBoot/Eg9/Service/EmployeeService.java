package com.SpringBoot.Eg9.Service;

import java.util.List;

import com.SpringBoot.Eg9.Model.Employee;

public interface EmployeeService 
{
	public String addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(int id);
}
