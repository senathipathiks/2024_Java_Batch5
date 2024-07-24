package com.giri.sbapp.service;

import java.util.List;

import com.giri.sbapp.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	public void updateStudent(Student student);
	public void deleteStudentId(int id);
}
