package com.springboot.assessment2.service;

import java.util.List;
import com.springboot.assessment2.model.Student;

public interface StudentService 
{
	public void addStudent(Student student);
	 
	public List<Student> getallStudent();

	public void updateStudent(Student student);

	public void deleteStudent(int sid);
	
	public Student findStuById(int sid);
}
