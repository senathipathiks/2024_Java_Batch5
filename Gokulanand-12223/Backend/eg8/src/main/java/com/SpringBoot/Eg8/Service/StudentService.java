package com.SpringBoot.Eg8.Service;

import java.util.List;

import com.SpringBoot.Eg8.Model.Student;

public interface StudentService 
{
	public void addStudent(Student student);
	
	public Student getStudent(int stuid);

	public List<Student> getallStudent();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int stuid);
}
