package com.assessment;

public class Doctor {
	private int doctorId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobilenumber;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, String firstName, String lastName, String email, long mobilenumber) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void display() {
		System.out.println("The Doctor Id is : " + doctorId);
		System.out.println("The Doctor FirstName is : " + firstName);
		System.out.println("The Doctor LastName is : " + lastName);
		System.out.println("The Doctor Mail is : " + email);
		System.out.println("The Doctor Phonenumber is : " + mobilenumber);

	}

}
