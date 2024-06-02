package com.gopi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.gopi.config.*;

@Configuration
//@ComponentScan(basePackages = "com.gopi.congic.*")
public class Config {

	
	@Bean
	public Subject disSub(){
		Subject s = new Subject();
		s.setSubid(1);
		s.setSubname("L & D");
		s.setSubmark(99);
		return s;
	}
	
	
	
	@Bean (name="std")
	public Student disStu() {
		Student std = new Student();
		std.setId(1);
		std.setName("Gopi");
		return std;
	}
	 
	
	
	
}
