package com.springboot.eg10.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springboot.eg10.model.Employee;
import com.springboot.eg10.repo.EmployeeRepo;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	Logger logger = (Logger) LoggerFactory.getLogger(EmployeeService.class);
	
	public EmployeeServiceImplementation(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	EmployeeRepo employeeRepo;
	
	@Override
	public String addEmployee(Employee employee) {
		employeeRepo.save(employee);
		logger.trace("employee service");
		return "AddSuccess";
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAllEmployees();
	}
	
	@Override
	public String updateEmployee(Employee employee) {
		employeeRepo.update(employee);
		return "UpdateSuccess";
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeRepo.findById(id);
	}
	@Override
	public String deleteEmployee(int id) {
		employeeRepo.delete(id);
		return "DeleteSuccess";
	}
}