package com.sms.bean;

public class Student {
	
	
		private String studid;
		private String studName;
		private String studEmail;
		private String password;
		
		

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Student(String studid, String studName, String studEmail, String password) {
			// TODO Auto-generated constructor stub
			super();
			this.studid = studid;
			this.studName = studName;
			this.studEmail = studEmail;
			this.password = password;
		}


		public String getStudid() {
			return studid;
		}
		public void setStudid(String studid) {
			this.studid = studid;
		}
		public String getStudName() {
			return studName;
		}
		public void setStudName(String studName) {
			this.studName = studName;
		}
		public String getStudEmail() {
			return studEmail;
		}
		public void setStudEmail(String studEmail) {
			this.studEmail = studEmail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}

