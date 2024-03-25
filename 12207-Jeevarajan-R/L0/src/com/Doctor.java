package com;

public class Doctor {

	
	//required attributes for bean Doctor class
	private int doctorId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobileNumber;
	
	//doctor constructor
	
	public Doctor(int doctorId, String firstName, String lastName, String email, long mobileNumber) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	//getters and setters
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void display() {
		System.out.println("Doctor Id : "+ getDoctorId());
		System.out.println("Doctor First Name : "+ getFirstName());
		System.out.println("Doctor Last Name : "+ getLastName());
		System.out.println("Doctor Email : "+ getEmail());
		System.out.println("Doctor contact number : "+ getMobileNumber());
		System.out.println("---------------------------------------");
	}
}
