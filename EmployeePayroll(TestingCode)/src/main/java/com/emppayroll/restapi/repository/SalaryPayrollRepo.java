package com.emppayroll.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emppayroll.restapi.model.Salary;

@Repository
public interface SalaryPayrollRepo extends JpaRepository<Salary, Integer>{

	
	
}
