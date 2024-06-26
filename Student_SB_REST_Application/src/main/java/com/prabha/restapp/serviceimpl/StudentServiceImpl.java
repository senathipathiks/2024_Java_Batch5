package com.prabha.restapp.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.prabha.restapp.model.Student;
import com.prabha.restapp.repository.Studentrepo;
import com.prabha.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	Studentrepo repo;
	public StudentServiceImpl(Studentrepo repo) {
		super();
		this.repo = repo;
	}
	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
	}

	public Student getStudent(int id) {
		return repo.findById(id).orElse(null);
	}
	
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	@Override
	public void updateStudent(Student stud) {
		repo.save(stud);
	}
	
	
	
	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}
