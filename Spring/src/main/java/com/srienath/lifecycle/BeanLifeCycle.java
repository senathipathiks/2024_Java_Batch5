package com.srienath.lifecycle;

public class BeanLifeCycle {
	public BeanLifeCycle() {
		System.out.println("Constructor method");
	}
	
	public void init()
	{
		System.out.println("Initialization method");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}
}
