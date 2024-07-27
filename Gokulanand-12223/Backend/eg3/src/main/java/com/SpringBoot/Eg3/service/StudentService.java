package com.SpringBoot.Eg3.service;

import java.util.List;

import com.SpringBoot.Eg3.model.Student;

public interface StudentService 
{
	public String addStudent(Student stud);
	public void deleteStudent(int id);
	public List<Integer> getIdList();
	public String updateStudent(Student stud);
}