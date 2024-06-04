package com.day10;

public class Contact {
		private String FirstName;
		private String lastName;
		private String email;
		private double Phone;
		public Contact() {
			super();
		}
		public Contact(String firstName, String lastName, String email, double phone) {
			super();
			this.FirstName = firstName;
			this.lastName = lastName;
			this.email = email;
			Phone = phone;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			this.FirstName = firstName;
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
		public double getPhone() {
			return Phone;
		}
		public void setPhone(double phone) {
			Phone = phone;
		}
		
		
		public void display() {
			System.out.println("First Name : " + FirstName);
			System.out.println("Last Name  : " + lastName);
			System.out.println("Email : " + email);
			System.out.println("Phone : " + Phone);

	}

}
