package day4;

public class Method_Overloading {

	public static void area(int side) {
		System.out.println(side * side);
	}
	// different work is assigned to a method. 
	//That is one will give the area of square and another will give the area of the reactangle

	public static void area(int side1,int side2) {
		System.out.println(side1 * side2);
		}
	

	public static void main(String[] args) {

		area(5);
		area(5, 2);
	}

}
