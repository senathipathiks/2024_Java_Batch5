package com.aravind.rest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.rest.model.Student;
import com.aravind.rest.repository.StudentRepo;
import com.aravind.rest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepo repo;

	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

//	@Override
//	public void addStudent(Student stud) {
//		repo.save(stud);
//	}

	@Override
	public String addStudent(Student stud) {
		if (stud != null) {
			repo.save(stud);
			return "Success";
		}
		return "Fail to add";

	}

	public Student getStudent(int id) {
		Optional<Student> stu = repo.findById(id);
		return stu.orElse(null);
	}
	


	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public String updateStudent(Student stud) {

		if (stud != null) {
			if (stud != null) {
				Optional<Student> existingStudent = repo.findById(stud.getId());
				if (existingStudent.isPresent()) {
					existingStudent.get().setName(stud.getName());
					existingStudent.get().setMobile(stud.getMobile());

					existingStudent.get().setCity(stud.getCity());

					existingStudent.get().setPincode(stud.getPincode());

					repo.save(existingStudent.get());
					return "Success";
				} 
			}
		}
		return "Fail to update";
	}

	@Override
	public String deleteStudent(int id) {
		Optional<Student> stud = repo.findById(id);
		if (stud != null) {
			repo.deleteById(id);
			return "Success";
		}
		return "Fail to delete";

	}

}
