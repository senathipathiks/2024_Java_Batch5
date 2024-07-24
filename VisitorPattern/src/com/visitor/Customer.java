package com.visitor;


//Implementation of Visitable Interface
public class Customer implements Visitable {
	
	private String nameOfCustomer;
	
	private String bookStatus;
	
	//argument constructor
	public Customer(String nameOfCustomer) {
		super();
		this.nameOfCustomer= nameOfCustomer;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	
	
}
