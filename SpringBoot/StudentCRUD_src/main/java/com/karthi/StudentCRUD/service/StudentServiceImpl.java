package com.karthi.StudentCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthi.StudentCRUD.StudentRepo;
import com.karthi.StudentCRUD.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;

	public String addStudent(Student student) {
		repo.save(student);
		return "Success";
	}
	
	public List<Student> viewStudents() {
		return repo.findAll();
	}
	
	public List<Integer> getIdList() {
		return repo.findAllId();
	}
	
	public List<String> getNameList() {
		return repo.findAllName();
	}
	
	public String deleteStudentById(int id) {
		repo.deleteById(id);
		return "Success";
	}
	
	public String deleteStudentByName(String name) {
		repo.deleteByName(name);
		return "Success";
	}
	
	public Student findStudent(int id) {
		return repo.findById(id).get();
	}
	
	public String updateStudent(Student student) {
		repo.save(student);
		return "Success";
	}
}
