package com.vidhu.task30;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		Employee e = (Employee)c.getBean(Employee.class);
		e.display();
	}

}
