package day5;

abstract class shape1{
	
	abstract double area();
	abstract double perimeter();	
}

class Rectangle extends shape1 {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
	
	double perimeter() {
		return 2*(length + width);
	}
}

class Circle extends shape1{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI*radius * radius;
	}
	
	double perimeter() {
		return 2* Math.PI * radius ;
	}
}

class Triangle extends shape1 {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}
	
	double area() {
		double s = (side1+ side2 + side3) / 2;
		return Math.sqrt(s*(s - side1)*(s-side2)* (s-side3));
	}
	
	double perimeter() {
		return side1+side2+side3;
	}
}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5d,10d);
		Circle circle = new Circle(7d);
		Triangle triangle = new Triangle(3d,4d,5d);
		
		System.out.println("Rectangle - Area:" + rectangle.area()+ "perimeter:" + rectangle.perimeter());
		System.out.println("Circle - Area:" + circle.area()+ "perimeter:" + circle.perimeter());
		System.out.println("Triangle - Area:" + triangle.area()+ "perimeter:" + triangle.perimeter());

	}

}
