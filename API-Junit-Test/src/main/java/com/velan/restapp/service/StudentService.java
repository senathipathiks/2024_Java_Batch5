package com.velan.restapp.service;

import java.util.List;
import com.velan.restapp.model.Student;

public interface StudentService {
	public String addStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public String updateStudent(Student student);
	public String deleteStudent(int id);
}
