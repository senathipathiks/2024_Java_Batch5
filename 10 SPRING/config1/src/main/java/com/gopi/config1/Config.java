package com.gopi.config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gopi.config1.*;

@Configuration
//@ComponentScan(basePackages = "com.gopi.config1")
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
	@Scope("singleton")
	public Faculty disStu() {
		Faculty std = new Faculty();
		std.setId(1);
		std.setName("Gopi");
		return std;
	}
}
