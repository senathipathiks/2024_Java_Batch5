package com.velan.BootCRUD.service;

import java.util.List;
import java.util.Optional;

import com.velan.BootCRUD.bean.Student;

public interface StudentService {

	public String addStudent(Student stud);
	public List<Integer> idList() ;
	public String deleteStudent(Student stud);
	public Optional<Student> fetchOne(int id);
	public String UpdateStudent(Student stud);
}
