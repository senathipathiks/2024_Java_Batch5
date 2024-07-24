package com.rest.MyRest.service;

import java.util.List;

import com.rest.MyRest.model.Student;

public interface StudentService  {
	
	public void addStudent(Student stud);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	public void updateStudent(Student stud);
	
	public void deleteStudent(int id);

}
