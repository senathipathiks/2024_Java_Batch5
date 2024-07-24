package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Product;
import com.madhan.restapp.repository.ProductRepo;

@Service
public class ProductServiceimpl {

	@Autowired
	ProductRepo repo;
	
	public void addProduct(Product pdt) {
		// TODO Auto-generated method stub
		repo.save(pdt);
	}

	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void updateProduct(Product pdt) {
		// TODO Auto-generated method stub
		repo.save(pdt);
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
