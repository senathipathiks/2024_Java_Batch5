package com.ani.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

	@Bean
	public Address genAddress() {
		Address add1=new Address();
		add1.setDoorno(123);
		add1.setStrname("St.Antony street");
		add1.setCity("Tirunelveli");
		return add1;
	}
	
	@Bean(name="student")
	public Stud genStud() {
		Stud stu=new Stud();
		stu.setId(24);
		stu.setName("Ani");
		return stu;
	}
}
