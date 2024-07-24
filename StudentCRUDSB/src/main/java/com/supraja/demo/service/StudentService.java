package com.supraja.demo.service;

import java.util.List;

import com.supraja.demo.Bean.Student;

public interface StudentService {
//  public String addStudent(Student stud);

//  public List<Integer> idList();
//  public String deleteStudent(Student stud);

	public String addStudent(Student stud);

	public List<Integer> idList();

	public List<String> getNameList();

	public void deleteStudent(int sid);

	public void deleteName(String sname);
	
	Student fetchOne(int id);
	
		void updateStudent(Student stud);
}
