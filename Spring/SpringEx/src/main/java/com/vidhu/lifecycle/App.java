package com.vidhu.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     context.close();
    }
}
