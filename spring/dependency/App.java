package com.ani.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
   // ClassPathResource res = new ClassPathResource("bean1.xml");
    ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
//    ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
    	//XmlBeanFactory factory = new XmlBeanFactory(res);
        Stud e = (Stud)context.getBean("student");
//        System.out.println(e);
        e.display();
    }
}
