package com.emproll.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emproll.model.Employee;

@Repository
public interface Emprepo{
	public void save(Employee employee);
	
	public List<Employee> findAllEmployees();
	
	public Employee findById(int id);
	
	public void update(Employee employee);
	
	public void delete(int id);
}
