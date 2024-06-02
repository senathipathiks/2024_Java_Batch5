package com.gopi.composcan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gopi.composcan.*;

@Configuration
@ComponentScan(basePackages = "com.gopi.composcan")
public class Config {

	
//	@Bean
//	
//	public Subject disSub(){
//		Subject s = new Subject();
//		s.setSubid(1);
//		s.setSubname("L & D");
//		s.setSubmark(99);
//		return s;
//	}
//	
//	@Bean (name="std")
//	@Scope("singleton")
//	public Student disStu() {
//		Student std = new Student();
//		std.setId(1);
//		std.setName("Gopi");
//		return std;
//	}
}
