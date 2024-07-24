package com.aravind.sonar.repository;

import java.util.List;

import com.aravind.sonar.model.Product;

public interface ProductRepo  {
		public void save(Product product);
		public void update(Product product);
		public void delete(int pid);
	    public List<Product> findAllProducts();
	    public Product findById(int pid);	
		
}
