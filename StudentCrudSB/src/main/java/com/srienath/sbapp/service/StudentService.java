package com.srienath.sbapp.service;


import java.util.List;

import com.srienath.sbapp.model.Student;

public interface StudentService {
	public String addStudent(Student stud);
	
	public void deleteStudent(int id);
	public void deleteStudentBySname(String name);

	public List<Integer> getIdList();

	public List<String> getNameList();
	
	 Student fetchOne(int id);
	
	public String updateStudent(Student stud);
}
