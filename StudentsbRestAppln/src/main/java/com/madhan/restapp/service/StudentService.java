package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	void updateStudent(Student student);
	void deleteStudent(int id);
}
