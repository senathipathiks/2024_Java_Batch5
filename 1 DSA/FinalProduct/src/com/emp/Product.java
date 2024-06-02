package com.emp;

// Beam Class

public class Product {
	
	// Declare the variables
	
	private int productId;
	private String productName;
	private int productprice;
	private String productQuantity;
	private int productWeight;
	private String productType;
	
	public Product() {
		super();
		
		// Empty Constructor with super of
	}

	public Product(int productId, String productName, int productprice, String productQuantity, int productWeight,
			String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
		this.productQuantity = productQuantity;
		this.productWeight = productWeight;
		this.productType = productType;
		
		// Initialize the global variables
	
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	// Getters and Setters for the Variables
	
	public void display() {
		System.out.println("Product ID is		: " + productId);
		System.out.println("Product Name is		: " + productName);
		System.out.println("Product Price is	: " + productprice);
		System.out.println("Product Quantity is	: " + productQuantity);
		System.out.println("Product Weigth is	: " + productWeight);
		System.out.println("Product Type is		: " + productType);
		
		// For display the Product Details
	
	}

}
