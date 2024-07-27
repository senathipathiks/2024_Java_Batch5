package com.aravind.rest.service;

import java.util.List;

import com.aravind.rest.model.Student;

public interface StudentService {
	
	public String addStudent(Student stud);
//	public void addStudent(Student stud);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public String updateStudent(Student stud);
	public String deleteStudent(int id);

}
