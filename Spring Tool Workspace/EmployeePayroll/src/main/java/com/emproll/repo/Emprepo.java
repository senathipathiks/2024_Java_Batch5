package com.emproll.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emproll.model.Employee;

@Repository
public interface Emprepo extends JpaRepository<Employee, Integer>{
	public void deleteById(int id);
}
