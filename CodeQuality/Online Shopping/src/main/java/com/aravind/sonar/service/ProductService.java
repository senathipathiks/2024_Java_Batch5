package com.aravind.sonar.service;

import java.util.List;

import com.aravind.sonar.model.Product;

public interface ProductService {
	

	
   public String addProduct(Product product);
	public String updateProduct(Product product);
	public String deleteProduct(int pid);
	public List<Product> getAllProduct();
	public Product getProduct(int pid);
	
	


}
