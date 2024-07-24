package com.supraja.SpringEx;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Employee e=(Employee)context.getBean("emp");
    	System.out.println(e);
    	
    	Student st=(Student)context.getBean("stu");
    	System.out.println(st);
    }
}
