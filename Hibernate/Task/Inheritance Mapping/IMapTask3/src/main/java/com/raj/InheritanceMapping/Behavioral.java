package com.raj.InheritanceMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Behavioral2")
public class Behavioral extends Tracker{
		int marks;
		String trainername;
		String topics;
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getTrainername() {
			return trainername;
		}
		public void setTrainername(String trainername) {
			this.trainername = trainername;
		}
		public String getTopics() {
			return topics;
		}
		public void setTopics(String topics) {
			this.topics = topics;
		}
		public Behavioral() {
			super();
			
		}
		public Behavioral(int empid, String empname, String role, int marks, String trainername, String topics) {
			super(empid, empname, role);
			this.marks = marks;
			this.trainername = trainername;
			this.topics = topics;
		}
		
		
		
		
}
