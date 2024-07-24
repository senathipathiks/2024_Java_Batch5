package com.supraja.atComponent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
   public static void main(String args[])
   {
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	   Student s=context.getBean(Student.class);
	   
	   s.display();
   }
}
