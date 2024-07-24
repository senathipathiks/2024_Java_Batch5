package com.nandha.TrackerInheritance.JOINED;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Technical_joined")
public class Technical extends Tracker{

		int empMarks;

		public Technical() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Technical(int empid, String empname, String emprole) {
			super(empid, empname, emprole);
			// TODO Auto-generated constructor stub
		}

		public Technical(int empid, String empname, String emprole, int empMarks) {
			super(empid, empname, emprole);
			this.empMarks = empMarks;
		}

		public int getEmpMarks() {
			return empMarks;
		}

		public void setEmpMarks(int empMarks) {
			this.empMarks = empMarks;
		}

		
}

