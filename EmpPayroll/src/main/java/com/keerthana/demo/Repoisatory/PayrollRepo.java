package com.keerthana.demo.Repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer> {

}
