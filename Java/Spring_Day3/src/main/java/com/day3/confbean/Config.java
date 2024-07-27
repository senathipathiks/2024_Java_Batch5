package com.day3.confbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean (name="stu")
	public Student getStudent() {
		Student stu = new Student();
		stu.setRno(007);
		stu.setName("Nagarjun");
		return stu;
	}	
	
	@Bean
	public Marks getMarks() {
		Marks m = new Marks();
		m.setTam(90);
		m.setEng(80);
		return m;
	}
}
