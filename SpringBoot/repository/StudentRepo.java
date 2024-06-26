package com.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
