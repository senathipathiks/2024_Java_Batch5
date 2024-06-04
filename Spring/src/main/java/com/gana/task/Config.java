package com.gana.task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gana.component.Address;

@Configuration
@ComponentScan(basePackages = "com.gana.task")
public class Config {

//	@Bean
//	@Scope("Singleton")
	
//	public Spec genAddress()
//	{
//		Spec add1 = new Spec();
//		add1.setDoorno(123);
//		add1.setStrname("husf strweer");
//		add1.setCity("mdu");
//		return add1;
//	}
}
