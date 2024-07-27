package com.hibernate.Trainer_Hiebrnate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Java extends Technical {
	String topic;
	String duration;
	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Java(int trainer_id, String trainer_name, String dept, String subject_name) {
		super(trainer_id, trainer_name, dept, subject_name);
		// TODO Auto-generated constructor stub
	}
	public Java(int trainer_id, String trainer_name, String dept) {
		super(trainer_id, trainer_name, dept);
		// TODO Auto-generated constructor stub
	}
	public Java(int trainer_id, String trainer_name, String dept, String topic, String duration) {
		super(trainer_id, trainer_name, dept);
		this.topic = topic;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Java [topic=" + topic + ", duration=" + duration + "]";
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
