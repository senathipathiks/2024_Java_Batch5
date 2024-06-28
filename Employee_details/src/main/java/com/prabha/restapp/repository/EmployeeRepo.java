package com.prabha.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
//public interface EmployeeRepo{
//	public void save(Employee emp);
//	public List<Employee> getAllEmployees();
//}