package com.hibernate.Trainer_perclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Technical_Perclass")
public class Technical extends Trainer {
	
	String subject_name;

	public Technical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technical(int trainer_id, String trainer_name, String dept) {
		super(trainer_id, trainer_name, dept);
		// TODO Auto-generated constructor stub
	}

	public Technical(int trainer_id, String trainer_name, String dept, String subject_name) {
		super(trainer_id, trainer_name, dept);
		this.subject_name = subject_name;
	}

	@Override
	public String toString() {
		return "Technical [subject_name=" + subject_name + "]";
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
}
