package com.day3_Task;

class Rectangle{
	int width,height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	int area() {
		return (width*height);
	}
	int perimeter() {
		return (2*(width+height));
	}
}

public class RectangleArea {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,4);
		System.out.println("Area = "+r.area());
		System.out.println("Perimeter = "+r.perimeter());
		

	}

}
