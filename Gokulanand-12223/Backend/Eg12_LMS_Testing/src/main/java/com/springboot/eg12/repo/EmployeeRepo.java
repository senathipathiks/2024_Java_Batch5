package com.springboot.eg12.repo;

import java.util.List;

import com.springboot.eg12.model.Employee;

public interface EmployeeRepo 
{
	public void save(Employee employee);

	public List<Employee> findAllEmployees();

	public void update(Employee employee);

	public void deleteById(int emp_id);
	
	public Employee findById(int emp_id);
}
