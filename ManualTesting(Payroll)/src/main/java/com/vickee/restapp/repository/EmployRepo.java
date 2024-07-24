package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Employee;

@Repository
public interface EmployRepo extends JpaRepository<Employee, Integer> {

}
