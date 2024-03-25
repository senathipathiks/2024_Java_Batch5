package oops.day1;

public class Practice4 {
	
	void instanceMethod() {
		System.out.println("This is Instance method");
	}
	
	static void staticMethod() {
		System.out.println("This is Static method");		
	}

	public static void main(String[] arg) {
		Practice4 p = new Practice4();
		//accessing instance method
		p.instanceMethod();
		
		//accessing static method
		Practice4.staticMethod();		
	}
}
