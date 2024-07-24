package com.nandha.Myapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandha.Myapplication.Repository.StudentRepo;

import com.nandha.Myapplication.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo repo;
	
	public String addStudent(Student stud) {
		
		repo.save(stud);
		return "Success";
	}
	

	public List<Student> studentDisplay() {
		// TODO Auto-generated method stub
		return repo.findAll();
		}
	
	public List<Integer> findAllIds() {
		
		return repo.findAllId();
		
	}
	
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Success";
	}
	
	public String deleteStudentName(String name) {
		repo.deleteByStudName(name);
		return "Success";
	}
	
	public Student findStudent(Student stud){		
		return repo.findById(stud.getStudid()).get();
	}
	
	@Override
	public Student findStudentName(Student stud){
		return repo.findByStudName(stud.getStudName());
	}


	@Override
	public List<String> findAllNames() {
		// TODO Auto-generated method stub
		return repo.findAllName();
	}


	public String updateStudent(Student student) {
		repo.save(student);
		return "Success";
	}

	
}
