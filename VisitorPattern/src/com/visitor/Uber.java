package com.visitor;


public class Uber {

	public static void doBookCab() {
		
		Cab cab=new Cab("TN 59 kk 0987");
		
		Customer karan=new Customer("Karan");
		
		karan.accept(cab);
		
	}
	
}
