package com.karthi.StudentCrudSP.service;

import java.util.List;

import com.karthi.StudentCrudSP.model.Student;


public interface StudentService {
	public String addStudent(Student student);
	
	public List<Student> viewStudents();
	
	public List<Integer> getIdList();
	
	public List<String> getNameList();
	
	public String deleteStudentById(int id);
	
	public String deleteStudentByName(String name);
	
	public Student findStudent(int id);
	
	public String updateStudent(Student student);
}
