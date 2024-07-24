package com.nandha.TrackerInheritance.TPC;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Behavioral_tpc")
public class Behavioral extends Tracker{
	
		int marks;
		String trainername;
		String topics;
		public Behavioral() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Behavioral(int empid, String empname, String emprole) {
			super(empid, empname, emprole);
			// TODO Auto-generated constructor stub
		}
		public Behavioral(int empid, String empname, String emprole, int marks, String trainername, String topics) {
			super(empid, empname, emprole);
			this.marks = marks;
			this.trainername = trainername;
			this.topics = topics;
		}
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
		
		
		
		
}

