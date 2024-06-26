package com.gopi.restapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopi.restapi.model.Student;
import com.gopi.restapi.repository.StudentRepo;
import com.gopi.restapi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
	}

//	@Override
//	public Student getStudent(int id) {
//		Student stud = repo.findById(id).get();
//		return stud;
//	}
//
//	@Override
//	public List<Student> getAllStudents() {
//		
//		return repo.findAll();
//	}
//
//	@Override
//	public void updateStudent(Student stud) {
//		repo.save(stud);
//	}
//
//	@Override
//	public void deleteStudent(int id) {
//		repo.deleteById(id);
//	}

}
