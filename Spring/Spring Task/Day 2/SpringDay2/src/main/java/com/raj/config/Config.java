package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
	@Bean 
	public Subject generateaddress() {
		Subject ad1 = new Subject();
		ad1.setS1(100);
		ad1.setS2(90);
		ad1.setS3(80);
		ad1.setS4(90);		
		ad1.setS5(100);
		return ad1;
	}
	
	@Bean (name="std1")
	public Student getStudent() {
		Student s1 = new Student();
		s1.setSid(100);
		s1.setSname("Ponraj");
		return s1;
	}
	
}

 

 