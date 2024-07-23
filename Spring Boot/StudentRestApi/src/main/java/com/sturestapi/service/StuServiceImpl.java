package com.sturestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sturestapi.model.Student;
import com.sturestapi.repo.StudentRepo;

@Service
public class StuServiceImpl implements StuService {

	public StuServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	StudentRepo repo;
	
	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
	}

	@Override
	public Optional<Student> getStudent(int id) {
		return repo.findById(id);	
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public void updateStu(Student stud) {
		repo.save(stud);
	}

	@Override
	public void delStu(int id) {
		repo.deleteById(id);
	}
	
}
