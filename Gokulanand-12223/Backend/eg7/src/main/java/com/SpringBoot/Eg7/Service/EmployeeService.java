package com.SpringBoot.Eg7.Service;

import java.util.List;

import com.SpringBoot.Eg7.Model.Employee;

public interface EmployeeService 
{
	public void addEmployee(Employee employee);
	
	public Employee getEmployee(int eid);

	public List<Employee> getallEmployee();
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int eid);
}
