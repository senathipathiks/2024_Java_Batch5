package com.employeepayroll.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeepayroll.application.model.Payroll;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Integer> {

}
