package com.aravind.sonar.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.aravind.sonar.model.Product;
import com.aravind.sonar.repository.ProductRepo;
import com.aravind.sonar.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	
	ProductRepo prepo;
	
	static final String SUCCESS = "Success";
	 static final String FAILURE = "Failure";
	
	 
	

	public ProductServiceImpl(ProductRepo prepo) {
		super();
		this.prepo = prepo;
	}

	public ProductRepo getPrepo() {
		return prepo;
	}

	public void setPrepo(ProductRepo prepo) {
		this.prepo = prepo;
	}

	@Override
	public String addProduct(Product product) {
		prepo.save(product);
		return SUCCESS;
		
	}

	@Override
	public Product getProduct(int pid) {
		return prepo.findById(pid);
	}

	@Override
	public List<Product> getAllProduct() {
		return prepo.findAllProducts();
	}

	
	@Override
	public String updateProduct(Product product) {
		prepo.update(product);
		return SUCCESS;
		
	}

	@Override
	public String deleteProduct(int pid) {
		prepo.delete(pid);
		return SUCCESS;
		
	}

}
