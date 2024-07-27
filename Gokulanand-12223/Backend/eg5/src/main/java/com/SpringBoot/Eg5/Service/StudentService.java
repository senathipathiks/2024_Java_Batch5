package com.SpringBoot.Eg5.Service;

import java.util.List;

import com.SpringBoot.Eg5.Model.Student;

public interface StudentService 
{
	public void addStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getallStudent();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);

}
