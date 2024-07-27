package com.springboot.eg12.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.eg12.model.Employee;
import com.springboot.eg12.repo.EmployeeRepo;

@Service
public class EmployeeServiceImplementation implements EmployeeService
{
	EmployeeRepo repo;

	public EmployeeServiceImplementation(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addEmployee(Employee employee) 
	{
		repo.save(employee);
	}

	@Override
	public List<Employee> getallEmployees() 
	{
		return repo.findAllEmployees();
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		repo.update(employee);
	}

	@Override
	public void deleteEmployee(int emp_id) 
	{
		repo.deleteById(emp_id);
	}

	@Override
	public Employee findEmployeeById(int emp_id) 
	{
		return repo.findById(emp_id);
	}
}
