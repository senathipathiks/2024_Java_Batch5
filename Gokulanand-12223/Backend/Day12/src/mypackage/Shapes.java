package mypackage;
import java.util.*;
abstract class Shape
{
	public abstract void area();
	public abstract void perimeter();
}
class Rectangle extends Shape
{
	int l,b;
	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	public void area()
	{
		System.out.println("Area of Rectangle is "+l*b);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle is "+2*(l+b));
	}
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r = r;
	}
	public void area()
	{
		System.out.println("Area of Circle is "+3.14 * r * r);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Circle is "+2 * 3.14 * r);
	}
}
class Triangle extends Shape
{
	int w, h, x, y, z;
	Triangle(int w, int h,int x, int y, int z)
	{
		this.w = w;
		this.h = h;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void area()
	{
		System.out.println("Area of Triangle is "+0.5 * w * h);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Triangle is "+ (x + y + z));
	}
}

class Shapes{

public static void main(String[] args)
{
	
	Shape obj1 = new Rectangle(5,5);
	obj1.area();
	obj1.perimeter();
	Shape obj2 = new Circle(5);
	obj2.area();
	obj2.perimeter();
	Shape obj3 = new Triangle(5,5,5,5,5);
	obj3.area();
	obj3.perimeter();
}

}
