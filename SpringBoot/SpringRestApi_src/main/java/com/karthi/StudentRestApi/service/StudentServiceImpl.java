package com.karthi.StudentRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthi.StudentRestApi.model.User;
import com.karthi.StudentRestApi.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public void addStudent(User student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

	@Override
	public User getStudent(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<User> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public void updateStudent(User student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}
	
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
