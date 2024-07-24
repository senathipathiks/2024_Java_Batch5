package com.nandha.SpringEx1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Faculty e = (Faculty)context.getBean(Faculty.class);
		e.display();
    }
}
