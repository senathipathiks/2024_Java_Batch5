package com.SpringBoot.Eg7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg7.Model.Employee;
import com.SpringBoot.Eg7.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImplementation implements EmployeeService 
{
	@Autowired
	EmployeeRepo repo;

	public void addEmployee(Employee employee) 
	{
		repo.save(employee);
	}

	@Override
	public Employee getEmployee(int eid) 
	{
		return repo.findById(eid).get();
	}

	@Override
	public List<Employee> getallEmployee() 
	{
		List<Employee> emplist = repo.findAll();
		return emplist;
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		repo.save(employee);
	}

	@Override
	public void deleteEmployee(int eid) 
	{
		repo.deleteById(eid);
	}
	
}
