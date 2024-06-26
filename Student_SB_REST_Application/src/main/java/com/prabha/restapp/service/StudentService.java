package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.Student;

public interface StudentService {
	public void addStudent(Student stud);  //insert

	public Student getStudent(int id); // find

	public List<Student> getAllStudents();  // view all

	void updateStudent(Student stud);   // update

	public void deleteStudent(int id);   // delete

}
