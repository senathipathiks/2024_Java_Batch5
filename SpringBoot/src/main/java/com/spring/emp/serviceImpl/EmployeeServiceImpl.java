package com.spring.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.emp.model.Employee;
import com.spring.emp.repository.EmployeeRepo;
import com.spring.emp.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public void addEmployee(Employee student) {

		repo.save(student);

	}

	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id).get();

	}

	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repo.save(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}

}
