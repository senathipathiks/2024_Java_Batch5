package com.supraja.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.supraja.restapp.model.Mark;

@Repository
public interface PayrollRepo extends JpaRepository<Mark, Integer> {
	@Query("select pid from Payroll")
	public List<Integer> getIDList();

}
