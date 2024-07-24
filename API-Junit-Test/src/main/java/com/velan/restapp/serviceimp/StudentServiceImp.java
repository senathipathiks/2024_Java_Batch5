package com.velan.restapp.serviceimp;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.velan.restapp.model.Student;
import com.velan.restapp.repository.StudentRepo;
import com.velan.restapp.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	StudentRepo repo;	
	public StudentServiceImp(StudentRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public String addStudent(Student student) {	
		if(student!=null)
		{
			repo.save(student);
			return "Success";
		}
		else {
			return "Failure";
		}
	}
	
	@Override
	public Student getStudent(int id) {
		Optional<Student> studentOptional=repo.findById(id);
		return studentOptional.orElse(null);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public String updateStudent(Student student) {	
		if(student!=null){
			repo.save(student);
			return "Success";
		}
		else {
			return "Failure";
		}
	}


	public String deleteStudent(int id) {
	    Optional<Student> student = repo.findById(id);
	    if (student.isPresent()) {
	        repo.deleteById(id);
	        return "Success";
	    } 
	    else {
	        return "Failure";
	    }
	}

}
