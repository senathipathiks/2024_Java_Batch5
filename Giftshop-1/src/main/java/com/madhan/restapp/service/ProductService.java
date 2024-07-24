package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Product;

public interface ProductService {
	
	public void addProduct(Product pdt);

	public Product getProduct(int id);

	public List<Product> getAllProduct();

	public void updateProduct(Product pdt);

	public void deleteProduct(int id);

}
