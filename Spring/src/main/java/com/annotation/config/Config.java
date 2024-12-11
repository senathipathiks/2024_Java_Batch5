package com.annotation.config;


import org.springframework.beans.factory.annotation.AnnotationBeanWiringInfoResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages = "com.annotation.component")
public class Config {
@Bean
public Address genAddress() {
	
	
	Address addr = new Address();
	addr.setNo(20);
	addr.setCity("Madurai");
	addr.setSt("Thendral 7th Street");
	return addr;
}
@Bean (name="std")
public Student genStudent(){
	Student student = new Student();
	student.setId(1001);
	student.setName("Vashi");
	return student;
}


}
