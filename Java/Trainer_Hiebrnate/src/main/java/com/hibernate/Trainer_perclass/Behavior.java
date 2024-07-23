package com.hibernate.Trainer_perclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Behavior_Perclass")
public class Behavior extends Trainer {
	String Sub_name;

	public Behavior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Behavior(int trainer_id, String trainer_name, String dept) {
		super(trainer_id, trainer_name, dept);
		// TODO Auto-generated constructor stub
	}

	public Behavior(int trainer_id, String trainer_name, String dept, String sub_name) {
		super(trainer_id, trainer_name, dept);
		Sub_name = sub_name;
	}

	@Override
	public String toString() {
		return "Behavior [Sub_name=" + Sub_name + "]";
	}

	public String getSub_name() {
		return Sub_name;
	}

	public void setSub_name(String sub_name) {
		Sub_name = sub_name;
	}
	
}
