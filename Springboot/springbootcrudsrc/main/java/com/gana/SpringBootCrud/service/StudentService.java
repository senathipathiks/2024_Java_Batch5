package com.gana.SpringBootCrud.service;

import java.util.List;

import com.gana.SpringBootCrud.model.Student;

public interface StudentService {
	
	public String addStudent(Student stud);
	public List<Integer> getIdList();
	public String deleteStudent(int n);
	public List<String> getNameList();
	public String deleteStudentByName(String n);
	
	public String updateStudent(Student stud);
	
	
	public Student findStudent(int n);
	public Student findStudentByName(String n);
	public List<Student> getStudList();
	

}
