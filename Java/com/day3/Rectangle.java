package com.day3;

public class Rectangle 
{

	int height;
	int width;
	
	Rectangle(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	void display ()
	{
		System.out.println("Area is : " + (height*width));
		System.out.println("Perimeter is : " + (2*(height + width)));
	}
	public static void main(String[] args) 
	{
		Rectangle obj = new Rectangle(10, 10);
		obj.display();

	}

}