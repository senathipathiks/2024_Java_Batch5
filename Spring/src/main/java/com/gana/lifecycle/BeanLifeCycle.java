package com.gana.lifecycle;

public class BeanLifeCycle {

	public BeanLifeCycle() {
		super();

			System.out.println("Constructor");
		
	}
	public void init() {
		System.out.println("Initialization Method");
	}
	public void destroy() {
		System.out.println("Destroy Method");
	}

}
