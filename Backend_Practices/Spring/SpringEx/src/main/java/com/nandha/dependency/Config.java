package com.nandha.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.nandha.dependency")
public class Config {
	
	@Bean
//	@Scope("Singleton")
	public Address genAddress() {
		Address address = new Address();
		address.setDoorNo(111);
		address.setStreet("BallRangapuram");
		address.setArea("Ismayilpuram");
		address.setCity("Madurai");
		address.setPinCode(625111);
		return address;
	}
	
	@Bean
	public Subject genSubject() {
		Subject subjects = new Subject();
		subjects.setS1("Tamil");
		subjects.setS2("English");
		subjects.setS3("Mathematics");
		subjects.setS4("Physics");
		subjects.setS5("Chemistry");
		subjects.setS6("Computer Science");

		return subjects;
	}
	
	@Bean(name = "student1")
	//@Scope("prototype")
	public Student genStudent() {
		
		Student studd = new Student();
		studd.setStuId(1);
		studd.setStuName("Nandha");
		return studd;
	}
	

}
