package com.springboot.eg10.repo;

import java.util.List;

import com.springboot.eg10.model.Employee;

public interface EmployeeRepo 
{
	public void save(Employee employee);
	
	public List<Employee> findAllEmployees();
	
	public Employee findById(int id);
	
	public void update(Employee employee);
	
	public void delete(int id);
}
