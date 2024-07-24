package com.supraja.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supraja.restapp.model.Student;

@Repository
public interface EmployeeRepo extends JpaRepository<Student, Integer> {

}
