package com.sturestapi.service;

import java.util.List;
import java.util.Optional;

import com.sturestapi.model.Student;

public interface StuService {

	public void addStudent(Student stud);
	public Optional<Student> getStudent(int id);
	public List<Student> getAllStudents();
	public void updateStu(Student stud);
	public void delStu(int id);
}
