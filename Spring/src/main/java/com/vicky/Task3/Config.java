package com.vicky.Task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.vicky.Task3")
public class Config {

	
	@Bean
	public Subject getSubject() {
		Subject s = new Subject();
		s.setSub1("Maths");
		s.setSub2("Physics");
		s.setSub3("Chemistry");
		return s;
	}
	@Bean(name="fac")
	public Faculty getFaculty() {
		Faculty f = new Faculty();
		f.setFid(1);
		f.setName("Sena");
		return f;
	}
}
