package com.employeepayroll.application.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.employeepayroll.application.model.Employee;
import com.employeepayroll.application.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(int id, Employee updatedEmployee) {
		Employee existingEmployee = employeeRepository.findById(id).orElse(null);
		if (existingEmployee != null) {
			existingEmployee.setName(updatedEmployee.getName());
			existingEmployee.setDepartment(updatedEmployee.getDepartment());
			return employeeRepository.save(existingEmployee);
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
