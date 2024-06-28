package com.prabha.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Employee;
public interface EmployeeRepo {
	
    public void save(Employee employee);
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void update(Employee employee);
		
	public void deleteById(int id);

}
//public interface EmployeeRepo{
//	public void save(Employee emp);
//	public List<Employee> getAllEmployees();
//}