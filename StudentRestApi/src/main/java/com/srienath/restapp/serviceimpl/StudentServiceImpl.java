package com.srienath.restapp.serviceimpl;

import com.srienath.restapp.service.StudentService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.restapp.repository.StudentRepo;
import com.srienath.restapp.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;
	
	@Override
	public String addStudent(Student stud) {
			repo.save(stud);
			return "Success";
	}
	
	@Override
	public Student getStudent(int id) {
		return repo.findById(id).get();
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
