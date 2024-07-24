package com.supraja.atComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.supraja.atComponent")
public class Config 
{
   @Bean
   @Scope("singleton")
   public Address generateaddress()
   {
	   Address ad=new Address();
	   ad.setDno("51/51");
	   ad.setStname("Villapuram");
	   ad.setCity("Madurai");
	   
	   return ad;
   }
   @Bean
   public Email generateEmail()
   {
	   Email e=new Email();
	   e.setEmail("suprajaa33@gmail.com");
	   
	   return e;
   }
}
