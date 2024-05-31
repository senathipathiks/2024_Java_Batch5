package com.day4.Faculty_Subject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subjects {
	@Value("1")
	int sub_id;
	@Value("Spring Boot")
	String sub_name;
	@Value("7")
	String sub_chapters;
	
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(int sub_id, String sub_name, String sub_chapters) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
		this.sub_chapters = sub_chapters;
	}

	@Override
	public String toString() {
		return "\n Subjects [sub_id=" + sub_id + ", sub_name=" + sub_name + ", sub_chapters=" + sub_chapters + "]";
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getSub_chapters() {
		return sub_chapters;
	}

	public void setSub_chapters(String sub_chapters) {
		this.sub_chapters = sub_chapters;
	}
	
	
}
