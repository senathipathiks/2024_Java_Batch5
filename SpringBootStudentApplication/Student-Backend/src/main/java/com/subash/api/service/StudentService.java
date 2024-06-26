package com.subash.api.service;

import java.util.List;

import com.subash.api.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public void addStudents(List<Student> student);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);
}
