package com.supraja.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
   public static void main(String args[])
   {
	   ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beans2.xml");
	   context.close();
   }
}
