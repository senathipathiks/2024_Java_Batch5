package com.supraja.restapp.service;

import java.util.List;


import com.supraja.restapp.model.Mark;

public interface MarkService 
{

	public interface MarksService {
		public String addMarks(MarksBean mark);
		public List<StudentBean> getAllMarks();
		public String updateMark(MarksBean mark);
		public StudentBean getMark(int id);
	 
	}
  
}
