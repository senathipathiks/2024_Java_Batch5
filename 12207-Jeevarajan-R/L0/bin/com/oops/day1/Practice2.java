package oops.day1;

public class Practice2 {
	
	int b = 20; //Instance or object variable 
	
	static int c = 15; //static or class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10; // local variable
		System.out.println(a);
		
		//accessing object variable by calling an object
		Practice2 p = new Practice2();
		System.out.println(p.b);
		
		//accessing static variable
		System.out.println(Practice2.c);  //Recommended way to access
//		System.out.println(p.c); //we can access by this way too
//		System.out.println(c);   //we can access by this way as well, it will confuse u wheather it is local or static variable
		
	}

}
