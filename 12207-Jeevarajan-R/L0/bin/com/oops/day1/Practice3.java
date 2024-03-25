package oops.day1;

public class Practice3 {
	
	//Instance vs Static variable
	
	int a = 20;
	
	static int b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice3  p = new Practice3();
		Practice3 p1 = new Practice3();
		
		System.out.println("a = "+p.a);
		System.out.println("a = "+p1.a);
		
		p.a = 15;
		System.out.println("a = "+p.a);
		System.out.println("a = "+p1.a);
		
		//before updating
		System.out.println("b = "+p.b);
//		System.out.println(p1.b);
		//after updating
		Practice3.b = 1;
		System.out.println("b = "+p.b);
		System.out.println("b = "+p1.b);
		
		
		
	
	}

}
