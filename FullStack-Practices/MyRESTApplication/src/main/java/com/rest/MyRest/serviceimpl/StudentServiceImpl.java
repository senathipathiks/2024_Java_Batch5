package com.rest.MyRest.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.MyRest.model.Student;
import com.rest.MyRest.repository.StudentRepo;
import com.rest.MyRest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
	}

	@Override
	public Student getStudent(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {

		return repo.findAll();
	}

	@Override
	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub
		
		repo.save(stud);

	}
	
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);

	}
	
	

}
