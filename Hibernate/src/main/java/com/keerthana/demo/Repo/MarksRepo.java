package com.keerthana.demo.Repo;

import java.util.List;

import com.keerthana.demo.Model.MarksBean;
import com.keerthana.demo.Model.StudentBean;

public interface MarksRepo {

public 	void save(MarksBean mark);



public List<StudentBean> findAllMarks();



public void update(MarksBean mark);



public StudentBean findById(int id);








}
