package com.keerthana.demo.Service;

import java.util.List;

import com.keerthana.demo.Model.StudentBean;

public interface StudService {

	String addStudent(StudentBean stu,int cId);

	List<StudentBean> getAllStudents();

}
