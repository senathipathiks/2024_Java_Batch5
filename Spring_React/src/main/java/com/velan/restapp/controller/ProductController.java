package com.velan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velan.restapp.model.Product;
import com.velan.restapp.serviceimp.ProductServiceImp;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	ProductServiceImp service;

	@PostMapping
	public String insertStudent(@RequestBody Product stud) {
		String msg = "";

		try {
			service.addStudent(stud);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Product getStudentById(@PathVariable("id") int id) {

		return service.getStudent(id);

	}

	@GetMapping("/all")
	public List<Product> getStudents() {

		return service.getAllStudents();

	}
	
	@PutMapping()
	public String updateStudent(@RequestBody Product stud) {
		String msg = "";

		try {
			service.updateStudent(stud);
			msg = "Success";
		}

		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteStudentById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteStudent(id);
			msg="Sucess";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
}
