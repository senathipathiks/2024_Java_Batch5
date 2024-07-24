package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Student;

public interface StudentService {
	public void addStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudent();

	public void updateStudent(Student student);

	public void deleteStudent(int id);

}
