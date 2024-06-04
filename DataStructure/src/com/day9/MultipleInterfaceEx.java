package com.day9;

// Multiple Inheritance using multiple interfaces

interface One{
	int a = 10; //public,static & final  
}

interface Two{
	int b = 20;
}

interface Three extends One,Two{
	void addition(); //public & abstract
}

class Addition implements Three{
	public void addition() {
		System.out.println(a + b);
	}
}

public class MultipleInterfaceEx {

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.addition();

	}

}
