package com.SpringBoot.Eg8.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg8.Model.Teacher;
import com.SpringBoot.Eg8.Repo.TeacherRepo;

@Service
public class TeacherServiceImplementation implements TeacherService
{
	@Autowired
	TeacherRepo repo;

	@Override
	public void addTeacher(Teacher teacher) 
	{
		repo.save(teacher);	
	}

	@Override
	public Teacher getTeacher(int tid) 
	{
		return repo.findById(tid).get();
	}

	@Override
	public List<Teacher> getallTeacher() 
	{
		List<Teacher> teacherlist = repo.findAll();
		return teacherlist;
	}

	@Override
	public void updateTeacher(Teacher teacher) 
	{
		repo.save(teacher);
	}

	@Override
	public void deleteTeacher(int tid) 
	{
		repo.deleteById(tid);
	}
}
