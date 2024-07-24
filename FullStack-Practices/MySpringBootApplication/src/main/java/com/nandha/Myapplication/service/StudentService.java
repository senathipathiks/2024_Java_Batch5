package com.nandha.Myapplication.service;

import java.util.List;
import java.util.Optional;

import com.nandha.Myapplication.model.Student;

public interface StudentService {
	
	public String addStudent(Student stud);
	
	public List<Student> studentDisplay();
	
	public List<Integer> findAllIds();
	
	public String deleteStudent(int id);
	
	public List<String> findAllNames();
	
	public String deleteStudentName(String name);

	public Student findStudent(Student stud);
	
	public Student findStudentName(Student stud);		

	public String updateStudent(Student student);
}
