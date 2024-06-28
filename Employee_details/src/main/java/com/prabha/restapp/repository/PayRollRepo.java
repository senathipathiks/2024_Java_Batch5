package com.prabha.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabha.restapp.model.Payroll;
@Repository
public interface PayRollRepo extends JpaRepository<Payroll, Integer> {

}
