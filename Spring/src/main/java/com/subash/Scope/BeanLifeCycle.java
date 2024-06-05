package com.subash.Scope;

public class BeanLifeCycle {

	public BeanLifeCycle() {
		System.out.println("bean Contructor .......");
	}
	public void init() {
		System.out.println("bean init ...........");
	}
	public void destroy() {
		System.out.println("bean destroy ...............");
	}

}
