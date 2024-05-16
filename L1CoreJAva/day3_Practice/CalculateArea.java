package com.day3_Practice;
class Rectangle{
	int width;
	int height;
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	int area() {
		return (width*height);
	}
	int perimeter() {
		return ((width+height)*2);
	}
}
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10,20);
		System.out.println(r.area());
		System.out.println(r.perimeter());

	}

}
