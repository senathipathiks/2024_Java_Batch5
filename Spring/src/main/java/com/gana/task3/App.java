package com.gana.task3;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {
	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Computer s = (Computer)context.getBean(Computer.class);
        s.display();
        

        
    }
}