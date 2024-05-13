package com.day1;

public class Customer {

	private int customer_Id;
	private String customer_Name;	
	private String customer_Email;
	private int customer_Age; 
	
	public Customer() {
		super();
	}

	public Customer(int customer_Id, String customer_Name, String customer_Email, int customer_Age) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		this.customer_Email = customer_Email;
		this.customer_Age = customer_Age;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getCustomer_Email() {
		return customer_Email;
	}

	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}

	public int getCustomer_Age() {
		return customer_Age;
	}

	public void setCustomer_Age(int customer_Age) {
		this.customer_Age = customer_Age;
	}

	public void display() {
		System.out.println("Customer Id: "+customer_Id);
		System.out.println("Customer Name: "+customer_Name);
		System.out.println("Customer Email: "+customer_Email);
		System.out.println("Customer Age: "+customer_Age);
		System.out.println("------------------------------");
	}
}
