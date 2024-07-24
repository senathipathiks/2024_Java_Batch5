package com.madhan.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Student;

@Repository
public interface StudentRepo {

	void save(Student stud);

	Student findById(int id);

	List<Student> findAll();

	void update(Student stud);

	void deleteById(int id);
}
