package com.day3;

class Rectangle{
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void area() {
		int area = (height*width);
		System.out.println("Area of the rectangle is:"+area);
	}
	
	void perimeter() {
		int perimeter = 2*(height+width);
		System.out.println("Perimeter of the rectangle is:"+perimeter);
	}
}
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(5,5);
		r.area();
		r.perimeter();
		

	}

}
