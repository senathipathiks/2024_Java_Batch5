package day1;

import java.util.*;

public class area_perimeter_circle {

	static void area_perimeter(Double n) {
		double area = 3.14 * n * n;
		double perimeter = 2 * 3.14 * n;
		System.out.println("Area of circle is : " + area);
		System.out.println("Perimeter of circle is : " + perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double n = Double.parseDouble(args[0]);
		area_perimeter(n);

	}

}
