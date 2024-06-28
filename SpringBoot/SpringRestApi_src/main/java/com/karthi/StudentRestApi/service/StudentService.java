package com.karthi.StudentRestApi.service;

import java.util.List;

import com.karthi.StudentRestApi.model.User;

public interface StudentService {
	
	public void addStudent(User student);
	
	public User getStudent(int id);
	
	public List<User> getAllStudents();
	
	public void updateStudent(User student);
	
	public void deleteStudent(int id);
	
}
