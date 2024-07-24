package com.keerthana.demo.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.MarksBean;
import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.Repo.MarksRepo;
import com.keerthana.demo.Service.MarksService;

@Service
public class MarksServiceImpl implements MarksService {
	
	@Autowired
	MarksRepo markRepo;

	public String addMarks(MarksBean mark) {
		markRepo.save(mark);
		System.out.println("mark service");
		return "Success";

	}
	public List<StudentBean> getAllMarks() {
		// TODO Auto-generated method stub
		return markRepo.findAllMarks();
	}
	public String updateMark(MarksBean mark) {
		markRepo.update(mark);
		return "Success";
	}
	public StudentBean getMark(int id) {
		// TODO Auto-generated method stub
		return markRepo.findById(id);
	}

	
	}


