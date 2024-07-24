package com.giri.sbapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Student;
import com.giri.sbapp.repository.StudentRepo;
import com.giri.sbapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);

	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
		
	}
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	@Override
	public void updateStudent(Student student) {
		repo.save(student);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteStudentId(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	

}
