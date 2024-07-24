package com.velan.restapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velan.restapp.model.Product;
import com.velan.restapp.repository.ProductRepo;
import com.velan.restapp.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepo repo;
	
	@Override
	public void addStudent(Product student) {
		
		repo.save(student);

	}

	@Override
	public Product getStudent(int id) {
		
		return repo.findById(id).get();
	
	}

	@Override
	public List<Product> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public void updateStudent(Product student) {
		
		repo.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		
		repo.deleteById(id);
		
	}

}
