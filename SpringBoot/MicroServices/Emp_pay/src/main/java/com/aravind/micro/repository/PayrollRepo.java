package com.aravind.micro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aravind.micro.model.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer> {
	
	
	@Query("select pid from Payroll")
	public List<Integer> getIdList();

}
