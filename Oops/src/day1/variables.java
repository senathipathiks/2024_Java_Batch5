package day1;

public class variables {
	
	int b = 10; // instance variable or class variable
	static int c = 30; // stattic variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables obj = new variables();
		System.out.println(obj.b);
		
		int a = 15; //local variable
		System.out.println(a);
		
		System.out.println(variables.c);
		
	}

}
