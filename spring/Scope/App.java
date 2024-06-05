package com.ani.Scope;

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
    	ClassPathResource res = new ClassPathResource("beans.xml");
//    ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
    	XmlBeanFactory factory = new XmlBeanFactory(res);
        Student e = (Student)factory.getBean("emp");
        System.out.println(e);
    }
}
