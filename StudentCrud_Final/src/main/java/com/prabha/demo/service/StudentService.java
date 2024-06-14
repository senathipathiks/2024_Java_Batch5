package com.prabha.demo.service;

import java.util.List;

import com.prabha.demo.model.Student;
import com.prabha.demo.repository.StudentRepo;

public interface StudentService {
	String addStudent(Student stud);
		
		List<Integer> idList();
		
		String deleteStudent(int id);
		
		List<String> nameList();
		
		String deleteStudentByName(String name);
		
		List<Student> fetchAll();
		
	}
	

