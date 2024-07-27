package com.springboot.StudentCrudCorrected.Service;

import java.util.List;

import com.springboot.StudentCrudCorrected.Model.Student;

public interface StudentService {

	public String addStudent(Student stud);
	public List<Student> viewAll();
	public List<Integer> getIdList();
	void delStu(int id);
	List<String> getNameList();
	void deletename(String sname);
	public Student fetchOne(int id);
	public String updateStudent(Student stud);
}