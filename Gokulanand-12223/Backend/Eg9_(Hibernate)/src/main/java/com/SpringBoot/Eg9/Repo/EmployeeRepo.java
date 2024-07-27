package com.SpringBoot.Eg9.Repo;

import java.util.List;

import com.SpringBoot.Eg9.Model.Employee;

public interface EmployeeRepo 
{
	public void save(Employee employee);
	
	public List<Employee> findAllEmployees();
	
	public Employee findById(int id);
	
	public void update(Employee employee);
	
	public void delete(int id);
}
