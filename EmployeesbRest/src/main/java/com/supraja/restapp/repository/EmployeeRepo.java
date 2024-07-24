package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

//public interface EmployeeRepo
//{
//	public void save(Employee employee);
//
//	public Employee findById(int id) ;
//
//	public List<Employee> findAll();
//
//
//	public void update(Employee Employee);
//
//	public void deleteById(int id);
//}