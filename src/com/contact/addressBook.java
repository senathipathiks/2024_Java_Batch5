package com.contact;

public class addressBook {
	private double mobNo;
	private String firstName;
	private String lastName;
	private String email;
	public addressBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public addressBook(int mobNo, String firstName, String lastName,  String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNo = mobNo;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("FirstName: " + firstName );
		System.out.println("LastName: " + lastName );
		System.out.println("Mobile Number : " + mobNo );
		System.out.println("email: " + email );

	}
	
}
