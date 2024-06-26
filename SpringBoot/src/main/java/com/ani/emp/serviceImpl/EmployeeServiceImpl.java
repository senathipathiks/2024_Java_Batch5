package com.ani.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.emp.model.Employee;
import com.ani.emp.repository.EmployeeRepo;
import com.ani.emp.service.EmployeeService;


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
