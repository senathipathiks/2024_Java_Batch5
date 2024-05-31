package com.spring.Lifecycle;

public class BeanLifeCycle {

	public BeanLifeCycle() {
		System.out.println("Const method");
	}
	
	public void init()
	{
		System.out.println("Init MEthod");
	}

	public void destroy()
	{
		System.out.println("Destroy MEthod");
	}

	
	
	
	
}
