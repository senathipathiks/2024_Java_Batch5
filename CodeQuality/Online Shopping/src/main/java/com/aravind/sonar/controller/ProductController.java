package com.aravind.sonar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.sonar.model.Product;
import com.aravind.sonar.serviceimpl.ProductServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:3000")
public class ProductController {

	ProductServiceImpl service;

	public ProductController(ProductServiceImpl service) {
		super();
		this.service = service;
	}

	public ProductServiceImpl getService() {
		return service;
	}

	public void setService(ProductServiceImpl service) {
		this.service = service;
	}

	static final String SUCCESS = "Success";
	static final String FAILURE = "Failure";

	@PostMapping
	public String insertProduct(@RequestBody Product product) {

		String msg = "";

		try {
			service.addProduct(product);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

	@GetMapping("{pid}")
	public Product getProductById(@PathVariable("pid") int id) {

		return service.getProduct(id);
	}

	@GetMapping("/all")
	public List<Product> getProducts() {

		return service.getAllProduct();
	}

	@PutMapping
	public String updateProduct(@RequestBody Product product) {
		String msg = "";

		try {
			service.updateProduct(product);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

	@DeleteMapping("{pid}")
	public String deleteProductById(@PathVariable("pid") int id) {
		String msg = "";

		try {
			service.deleteProduct(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;

	}

}
