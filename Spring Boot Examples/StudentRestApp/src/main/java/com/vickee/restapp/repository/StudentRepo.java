package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
