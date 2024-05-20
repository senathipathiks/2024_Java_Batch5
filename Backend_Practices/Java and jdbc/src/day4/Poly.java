package day4;

public class Poly {
	
//	public static void area(int side) {
//		System.out.println(side*side);
//	}
//	
//	public static void area(int l, int b) {
//		System.out.println(l*b);
//	}
	
	int rollno;
	String name;
//	
	Poly(){
		rollno = 0;
		name = " ";
	}
	
	Poly(int r){
		rollno = r;
		name = "Relevantz";
	}
	
	Poly(int r, String s){
		rollno = r;
		name = s;
	}
	

	public static void main(String[] args) {
		
//		area(5);
//		area(5, 2);
		
		Poly jingiliya1 = new Poly();
		Poly jingiliya2 = new Poly(12);
		Poly jingiliya3 = new Poly(13, "Arun");
		
		System.out.println(jingiliya1.rollno+", "+jingiliya1.name);
		System.out.println(jingiliya2.rollno+", "+jingiliya2.name);
		System.out.println(jingiliya3.rollno+", "+jingiliya3.name);




	}

}
