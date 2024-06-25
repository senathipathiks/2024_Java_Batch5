package com.srienath.sbapp.service;

import com.srienath.sbapp.service.StudentService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srienath.sbapp.Repository.StudentRepo;
import com.srienath.sbapp.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;
	
	@Override
	public String addStudent(Student stud) {
			repo.save(stud);
			return "Success";
	}
	
	@Override
	public List<Integer> getIdList(){
		List<Integer> idList = repo.fetchIdList();
		return idList;
	}
	
	public void deleteStudent(int id) {
		int sid = id;
		repo.deleteById(sid);
	}
	
	@Override
	public List<String> getNameList(){
		List<String> nameList = repo.fetchNameList();
		return nameList;
	}

	
	public void deleteStudentBySname(String name) {
		String sname = name;
		repo.deleteBySname(sname);
	}

	public Student fetchOne(int id) {
		Student student = repo.findById(id).orElse(new Student());
		return student;
	}

	public String updateStudent(Student stud) {
		repo.save(stud);
		return "Success";
	}

	
}
