package com.vicky.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.vicky.autowired")
public class Config {

//	@Bean
//	@Scope("singleton")
//	public Address getAddress() {
//		Address add = new Address();
//		add.setDoorno(12);
//		add.setStrname("Rajiv Nagar");
//		add.setCity("Kovilpatti");
//		return add;
//	}
	
	
	
	
//	@Bean(name="stud")
//	public Student getStudent() {
//		Student st = new Student();
//		st.setSid(1);
//		st.setSname("vicky");
//		return st;
//	}
	
}
