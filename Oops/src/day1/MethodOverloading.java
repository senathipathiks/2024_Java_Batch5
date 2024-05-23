package day1;

public class MethodOverloading {
	
	void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	void addition(float a, float b) {
		System.out.println(a + b);
	}
	
	void addition(int a , int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.addition( 1.5f, 3.0f);
		obj.addition( 2, 4);
		obj.addition(2, 34, 56);
		 
	}

}
