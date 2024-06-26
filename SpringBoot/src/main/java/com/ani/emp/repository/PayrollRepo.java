package com.ani.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ani.emp.model.Payroll;


@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer>{

}
