package com.gopi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopi.restapi.model.Student;

//@Repository
//public interface StudentRepo extends JpaRepository<Student, Integer>{
//	
//}

public interface StudentRepo{
	void save(Student stud);
}