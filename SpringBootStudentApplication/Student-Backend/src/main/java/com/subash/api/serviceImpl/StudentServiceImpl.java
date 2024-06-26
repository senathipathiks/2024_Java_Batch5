package com.subash.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subash.api.model.Student;
import com.subash.api.repository.StudentRepo;
import com.subash.api.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public void addStudent(Student student) {
		repo.save(student);
	}

	@Override
	public void addStudents(List<Student> student) {
		repo.saveAll(student);
	}

	@Override
	public Student getStudent(int id) {
		
		return repo.findById(id).get();
		
	}

	public List<Student> getAllStudents() {
		
		
		return repo.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		
		repo.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		
		repo.deleteById(id);
		
	}
	

}
