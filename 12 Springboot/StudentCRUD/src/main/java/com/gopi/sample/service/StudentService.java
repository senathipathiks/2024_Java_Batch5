package com.gopi.sample.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.gopi.sample.model.Student;

public interface StudentService {

	String addStudent(Student stud);
	
	List<Integer> idList();
	
	String deleteStudent(int id);
	
	List<String> nameList();
	
	List<String> nameListDel();
	
	String deleteStudentByName(String name);
	
	List<Student> fetchAll();
	
	Student fetchOne(int id);
	
	void updateStudent(Student stud);
	
	Student fetchById(int id);
	
	Student fetchBySname(String name);
	
}
