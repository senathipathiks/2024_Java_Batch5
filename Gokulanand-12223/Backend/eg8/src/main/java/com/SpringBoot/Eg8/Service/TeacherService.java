package com.SpringBoot.Eg8.Service;

import java.util.List;

import com.SpringBoot.Eg8.Model.Teacher;

public interface TeacherService 
{
	public void addTeacher(Teacher teacher);
	
	public Teacher getTeacher(int tid);

	public List<Teacher> getallTeacher();
	
	public void updateTeacher(Teacher teacher);
	
	public void deleteTeacher(int tid);
}
