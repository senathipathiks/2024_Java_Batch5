package com.gopi.config1;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gopi.config1.*;


/**
 * Hello world!
 *																																																
 */
public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Faculty e1 = (Faculty)context.getBean("std");
//    	Faculty e1 = (Faculty)context.getBean(Faculty.class);
    	System.out.println(e1);

    	
    }
}
