package com.employeepayroll.application.service;

import java.util.List;
import com.employeepayroll.application.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(int id);

	Employee saveEmployee(Employee employee);

	void deleteEmployee(int id);

	Employee updateEmployee(int id, Employee updatedEmployee); // New method for updating employee

	List<Employee> getAllEmployees();
}
