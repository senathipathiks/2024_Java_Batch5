package com.hibernate.InheritanceMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class Technical extends Tracker{

		int marks;

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public Technical() {
			super();
			
		}

		public Technical(int empid, String empname, String role, int marks) {
			super(empid, empname, role);
			this.marks = marks;
		}

		
		
		
}
