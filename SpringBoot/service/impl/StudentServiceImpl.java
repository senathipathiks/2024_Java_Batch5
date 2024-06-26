package com.spring.restapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.model.Student;
import com.spring.restapi.repository.StudentRepo;
import com.spring.restapi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	StudentRepo repo;
	
	 @Override
	 public void addStudent(Student stud) {
	 repo.save(stud);
	 }

	
	 @Override
		public Student getStudent(int id) {
		    Optional<Student> studentOptional = repo.findById(id);
		    return studentOptional.orElse(null);
		}

	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}


	@Override
	public void updateStudent(Student stud) {
		
		repo.save(stud);
		
	}


	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	
	}
}
