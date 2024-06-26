package com.emproll.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emproll.model.Payroll;

@Repository
public interface Payrollrepo extends JpaRepository<Payroll, Integer> {
	public void deleteById(int id);
}
