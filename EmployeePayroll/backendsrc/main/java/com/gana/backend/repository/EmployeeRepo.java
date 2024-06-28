package com.gana.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gana.backend.model.Employee;


public interface EmployeeRepo {
	public void save(Employee employee);

	public Employee findById(int employeeid) ;

	public List<Employee> findAll();


	public void update(Employee employee);

	public void deleteById(int id);

}
