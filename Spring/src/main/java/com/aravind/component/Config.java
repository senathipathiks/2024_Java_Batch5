package com.aravind.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.aravind.component")
public class Config {
	@Bean
	public Address genAddress() {
		Address add = new Address();
		add.setDoorno(123);
		add.setStrname("NGO Colony");
		add.setCity("dindigul");
		return add;	
	}
//	@Bean(name="stu")
//	public Student genStudent() {
//		Student st = new Student();
//		st.setSid(17);
//		st.setSname("Aravind");
//		return st;
//	}

}
