package com.rest.MyRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.MyRest.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	

}
