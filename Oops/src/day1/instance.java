package day1;

public class instance {
	void myMethod1() {
		System.out.println("Instance Method");
	}
	
	static void myMethod() {
		System.out.println("Static Method");
	}
	
	public static void main(String [] args) {
		instance obj = new instance();
		obj.myMethod1();
		
		instance.myMethod();
		
	}
}
