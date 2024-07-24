package com.velan.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.velan.restapp.model.Employee;

@Repository
public interface EmployeeRepo{

    public void save(Employee employee);
	public List<Employee> findAllEmployees();
	public Employee findById(int id);
	public void update(Employee employee);
	public void delete(int id);
	
}

