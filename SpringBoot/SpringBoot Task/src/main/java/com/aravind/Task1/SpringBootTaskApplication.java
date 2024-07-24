package com.aravind.Task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTaskApplication.class, args);
		User us =  context.getBean(User.class);
		us.setPass("Aravind2@");
		us.setUser("Aravind");
		
		
		
	}

}
