package com.visitor;

//Implementation of Visitor Interface
public class Cab implements Visitor {
	
	private String cabNumber;
	
	//argument constructor
	public Cab(String cabNumber) {
		super();
		this.cabNumber= cabNumber;
	}

	//getter setter
	public String getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}
	
	public void visit(Visitable visitable) {
		Customer cust=(Customer) visitable;
		cust.setBookStatus("Booked");
		
		
		System.out.println("Cab number: "+this.cabNumber+ " is arriving to "+cust.getNameOfCustomer() + " and the cab to assigned destination has been "+cust.getBookStatus());
	
	}

}
