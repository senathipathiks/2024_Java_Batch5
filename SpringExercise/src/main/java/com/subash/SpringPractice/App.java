package com.subash.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sim jiosim = context.getBean("jiosim",Sim.class);
        jiosim.calling();
        jiosim.data();
        Sim airtelsim = context.getBean("airtelsim",Sim.class);
        airtelsim.calling();
        airtelsim.data();
        Sim vodafonesim = context.getBean("vodafonesim",Sim.class);
        vodafonesim.calling();
        vodafonesim.data();
    }
}
