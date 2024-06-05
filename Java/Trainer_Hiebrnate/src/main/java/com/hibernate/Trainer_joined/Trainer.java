package com.hibernate.Trainer_joined;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Trainer_Joined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Trainer {
	@Id
	int trainer_id;
	@Column
	String trainer_name;
	@Column
	String dept;
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int trainer_id, String trainer_name, String dept) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Trainer [trainer_id=" + trainer_id + ", trainer_name=" + trainer_name + ", dept=" + dept + "]";
	}

	public int getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
