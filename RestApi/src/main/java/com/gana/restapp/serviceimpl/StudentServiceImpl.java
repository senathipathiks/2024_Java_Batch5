package com.gana.restapp.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.gana.restapp.model.Student;
import com.gana.restapp.repository.StudentRepo;
import com.gana.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	StudentRepo repo;

	@Override
	public void addStudent(Student student) {
		
		repo.save(student);
		

	}
	
	@Override
	public Student getStudent(int id) {
		
		return repo.findById(id).orElse(null);
		

	}

	@Override
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
