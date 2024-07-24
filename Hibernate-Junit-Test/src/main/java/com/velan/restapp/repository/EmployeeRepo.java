package com.velan.restapp.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Employee;

@Repository
public interface EmployeeRepo{

    public String save(Employee employee);
	public List<Employee> findAllEmployees();
	public Employee findById(int id);
	public String update(Employee employee);
	public String delete(int id);
	
}

