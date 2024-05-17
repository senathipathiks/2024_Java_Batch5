package Exercises;
class Area{
	int length;
	int width;
	Area(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void display()
	{
		System.out.println("Area: "+length*width);		
	}
}
class Perimeter extends Area
{
	Perimeter(int length,int width)
	{
		super(length,width);
	}
	void display()
	{
		System.out.println("Perimeter: "+(length+width)*2);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		
		Area a=new Area(5,7);
		a.display();
		Perimeter p=new Perimeter(8,9);
		p.display();
	}

}
