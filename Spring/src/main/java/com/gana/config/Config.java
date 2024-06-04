package com.gana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
public class Config {

	@Bean
	public Address genAddress()
	{
		Address add1 = new Address();
		add1.setDoorno(123);
		add1.setStrname("husf strweer");
		add1.setCity("mdu");
		return add1;
	}
	
	@Bean (name="stu")
	public Student genStudent() {
		Student std = new Student();
		std.setId(1);
		std.setName("Gana");
		return std;
	}
	
}
