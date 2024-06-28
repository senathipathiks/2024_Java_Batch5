package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Student;
import com.vickee.restapp.repository.StudentRepo;
import com.vickee.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	@Override
	public void addStudent(Student student) {
		
		repo.save(student);
	}
	@Override
	public Student getStudent(int id) {
		
		Optional<Student> stuOptional = repo.findById(id);
		return stuOptional.orElse(null);
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
