package com.gopi.restapp.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Employee;
import com.gopi.restapp.repository.EmployeeRepo;
import com.gopi.restapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp = repo.findById(id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		repo.update(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
