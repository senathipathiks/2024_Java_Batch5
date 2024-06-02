package com.gopi.employee;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gopi.employee.*;


/**
 * Hello world!
 *																																																
 */
public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Employee e1 = (Employee)context.getBean("emp");
//    	Faculty e1 = (Faculty)context.getBean(Faculty.class);
    	System.out.println(e1);

    	
    }
}
