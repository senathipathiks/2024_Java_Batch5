package com.raj.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
	@Bean 
	public Subject generateaddress() {
		Subject dp = new Subject();
		dp.setSub_id(100);
		dp.setSub_name("Marketing");
		dp.setSub_chapters("5");
		return dp;
	}
	
	@Bean (name="std1")
	public Faculty getFaculty() {
		Faculty e1 = new Faculty();
		e1.setFac_id(1);
		e1.setFac_name("Ponraj");
		e1.setFac_address("kovilpatti");
		return e1;
	}
	
}

 

 