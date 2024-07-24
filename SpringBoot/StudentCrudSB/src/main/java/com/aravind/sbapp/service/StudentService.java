package com.aravind.sbapp.service;

import java.util.List;
import java.util.Optional;

import com.aravind.sbapp.model.Student;

public interface StudentService {
	
	public String addStudent(Student stud);
	public List<Integer> idList();
	public String deleteStudent(Student stud);
	public Optional<Student> fetchOne(int id);
	public String updateStudent(Student stud);
	public List<Student> fetchAll();
	
	

}
