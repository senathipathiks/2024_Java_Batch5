package com.keerthana.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.Model.MarksBean;
import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.ServiceImpl.MarksServiceImpl;
import com.keerthana.demo.ServiceImpl.StudServiceImpl;

@RestController
@RequestMapping("/marks")
@CrossOrigin("*")
public class MarksController {

	@Autowired
	MarksServiceImpl markserviceImpl;
	
	@PostMapping
	public String insertRequest(@RequestBody MarksBean mark) {
		String msg = "";
		try {
			msg = markserviceImpl.addMarks(mark);
			System.out.println(mark.getEnglish());
			System.out.println(mark.getMaths());
			System.out.println(mark.getComputer());
			System.out.println(mark.getTotalMarks());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("all")
	public List<StudentBean> getMark() {
		return markserviceImpl.getAllMarks();
	}
	@PutMapping
	public String updateRequest(@RequestBody MarksBean mark) {
		String msg = "";
		try {
			msg = markserviceImpl.updateMark(mark);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	@GetMapping("{id}")
	public StudentBean getMarkById(@PathVariable("id") int id) {
		return markserviceImpl.getMark(id);
	}
	
}
