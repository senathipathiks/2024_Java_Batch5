package com.sturestapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sturestapi.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	public void deleteById(int id);
}