package com.gana.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gana.backend.model.Employee;

import com.gana.backend.repository.EmployeeRepo;

import com.gana.backend.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public void addEmployee(Employee employee) {
		
		repo.save(employee);
		

	}
	
	@Override
	public Employee getEmployee(int employeeid) {
		
		return repo.findById(employeeid);
		

	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		repo.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeid) {
		repo.deleteById(employeeid);
		
	}


}
