package com.keerthana.demo.Repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
