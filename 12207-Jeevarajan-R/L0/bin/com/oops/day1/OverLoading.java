package oops.day1;

public class OverLoading {
	
	//method over loading
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//same method name with different arguments
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading ovl = new OverLoading();
		
		ovl.add(1.0, 1.2);
		ovl.add(1, 1, 3);
		ovl.add(1, 3);

	}

}
