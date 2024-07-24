package com.nandha.Lifecycle;

public class BeanLifeCycle {
	
	public BeanLifeCycle() {
		System.out.println("Constructor Method");
	}
	
	public void init() {
		System.out.println("Initialization Method");

	}
	
	public void destroy() {
		System.out.println("Destroy Method");

	}

}
