package com.keerthana.demo.Repo;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.StudentBean;

@Repository
public interface StudRepo {

	public void save(StudentBean stu);

	public List<StudentBean> findAllStudents();

	public void update(StudentBean stu);

	public StudentBean findById(int id);

	public String deleteById(int id);

}
