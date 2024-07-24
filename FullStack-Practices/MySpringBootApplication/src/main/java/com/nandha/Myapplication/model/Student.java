package com.nandha.Myapplication.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdb")
public class Student {
	
		@Id
		@Column(name = "studentId")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int studid;
		
		@Column(name = "studentName")
		private String studName;
		
		@Column(name = "studentCity")
		private String studCity;
		
		

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Student(int studid, String studName, String studCity) {
			super();
			this.studid = studid;
			this.studName = studName;
			this.studCity = studCity;
		}



		public int getStudid() {
			return studid;
		}



		public void setStudid(int studid) {
			this.studid = studid;
		}



		public String getStudName() {
			return studName;
		}



		public void setStudName(String studName) {
			this.studName = studName;
		}



		public String getStudCity() {
			return studCity;
		}



		public void setStudCity(String studCity) {
			this.studCity = studCity;
		}



		@Override
		public String toString() {
			return "Student [studid=" + studid + ", studName=" + studName + ", studCity=" + studCity + "]";
		}

		
}


