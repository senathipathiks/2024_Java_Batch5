package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Employee;
import com.velan.restapp.repository.EmployeeRepo;
import com.velan.restapp.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public void addEmployee(Employee emp) {
		
		repo.save(emp);

	}

	@Override
	public Employee getEmployee(int id) {
		
		return repo.findById(id).get();
	
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp) {
		
		repo.save(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		repo.deleteById(id);
		
	}

}

