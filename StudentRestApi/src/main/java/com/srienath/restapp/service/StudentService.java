package com.srienath.restapp.service;


import java.util.List;
import com.srienath.restapp.model.Student;

public interface StudentService {
	public String addStudent(Student stud);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	public void updateStudent(Student stud);
	
	public void deleteStudent(int id);

}
