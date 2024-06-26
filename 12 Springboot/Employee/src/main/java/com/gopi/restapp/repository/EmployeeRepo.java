package com.gopi.restapp.repository;

import java.util.List;


import com.gopi.restapp.model.Employee;


public interface EmployeeRepo {
	public void save(Employee emp);
	Employee findById(int id);
	List<Employee> findAll();
	void update(Employee emp);
	void deleteById(int id);
}
