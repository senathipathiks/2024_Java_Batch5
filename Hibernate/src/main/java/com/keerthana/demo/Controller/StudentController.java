package com.keerthana.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.ServiceImpl.StudServiceImpl;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudServiceImpl studserviceImpl;
	
	@PostMapping
	public String insertRequest(@RequestBody StudentBean stu,@RequestParam int cId) {
		String msg = "";
		try {
			msg = studserviceImpl.addStudent(stu,cId);
			System.out.println(stu.getName());
			System.out.println(stu.getMarks());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	
	@GetMapping("all")
	public List<StudentBean> getStudents() {
		return studserviceImpl.getAllStudents();
	}
	@PutMapping
	public String updateRequest(@RequestBody StudentBean stu) {
		String msg = "";
		try {
			msg = studserviceImpl.updateEmployee(stu);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
	@GetMapping("{id}")
	public StudentBean getStudById(@PathVariable("id") int id) {
		return studserviceImpl.getEmployee(id);
	}
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		String msg = "";
		try {
			msg = studserviceImpl.deleteStud(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			msg = "Failer";
		}
		return msg;
	}
}

