package com.springboot.StudentCrudCorrected.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.StudentCrudCorrected.Model.Student;
import com.springboot.StudentCrudCorrected.Repository.StudentRepo;

@Service
public class StudentServiceImplementation implements StudentService{
	@Autowired
	StudentRepo repo;
	
	public String addStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}
	
	public List<Student> viewAll() {
		return repo.findAll();
	}
	
	public void delStu(int sid) {
		repo.deleteById(sid);
	}
	
	@Override
	public List<Integer> getIdList(){
		List<Integer> idList = repo.fetchIdList();
		return idList;
	}

	public List<String> getNameList() {
		List<String> nameList = repo.fetchNameList();
		return nameList;
	}
	
	@Override
	public void deletename(String sname) {
		repo.deleteBySname(sname);
	}

	public String updateStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}

	public Student fetchOne(int id) {
		return repo.findById(id).get();
	}

}
