package com.supraja.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Student;
import com.supraja.restapp.repository.StudentRepo;
import com.supraja.restapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	StudentRepo repo;

	@Override
	public String addStudent(Student student) {
		if(student != null) {
			repo.save(student);
			return "success";
		}else {
			return "Fail to Add";
		}
	}

	@Override

	public Student getStudent(int id) {
		
		Student stu=repo.findById(id).orElse(null);
		return stu;
	}
		
		
	

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public String updateStudent(Student student) {
		if(student!=null) {
		repo.save(student);
		return "updated";
		}
		else {
			return "Not updated";
		}
	}

	@Override
	public String deleteStudent(int id) {
	    Student student = repo.findById(id).orElse(null);
	    if (student != null) {
	        repo.deleteById(id);
	        return "Deleted";
	    } else {
	        return "Failed to delete";
	    }
	}


}

