package com.raj.Scope;

public class BeanLifeCycle {
	
	public BeanLifeCycle() {
		System.out.println("Constructor Method!");
	}
	public void init() {
		System.out.println("Init Method call!");
	}
	public void destroy() {
		System.out.println("Destroy Method Call!");
	}
	
	
}
