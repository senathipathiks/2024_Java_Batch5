package com.velan.restapp.service;

import java.util.List;

import com.velan.restapp.model.Product;

public interface ProductService {

	public void addStudent(Product student);
	public Product getStudent(int id);
	public List<Product> getAllStudents();
	public void updateStudent(Product student);
	public void deleteStudent(int id);
}
