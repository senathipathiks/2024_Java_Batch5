package com.srienath.ScopeDay2;
import org.springframework.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
    	Student s1 = (Student)context.getBean("stu1",Student.class);
        s1.setStudName("Arun");
        Student s2 = (Student)context.getBean("stu1",Student.class);
        System.out.println(s1);
        System.out.println(s2);
        if(s1==s2) {
        	System.out.println("reference EQUAL");
        }
        else {
        	System.out.println("reference not EQUAL");

        }
        

    }
}
