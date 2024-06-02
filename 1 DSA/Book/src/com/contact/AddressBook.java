package com.contact;

public class AddressBook {
	private String phoneNumber;
	private String fName;
	private String lName;
	private String email;
	private String address;

	public AddressBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressBook(String phoneNumber, String fName, String lName, String email, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Phone Number	: " + phoneNumber);
		System.out.println("First Name	: " + fName);
		System.out.println("Last Name	: " + lName);
		System.out.println("Email Id	: " + email);
		System.out.println("Address	: " + address);

	}

}
