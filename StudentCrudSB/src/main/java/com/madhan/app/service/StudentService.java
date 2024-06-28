package com.madhan.app.service;

import java.util.List;

import com.madhan.app.model.Student;

public interface StudentService {

String addStudent(Student stud);
	
	List<Integer> idList();
	
	String deleteStudent(int id);
	
	List<String> nameList();
	
	String deleteStudentByName(String sname);
	
	List<Student> fetchAll();
	
}
