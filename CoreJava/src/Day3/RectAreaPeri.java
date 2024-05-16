package Day3;

class Rectangle{
	int width;
	int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	void area() {
		int area=height*width;
		System.out.println("Area :"+area);
	}
	void perimeter() {
		int peri=2*(height+width);
		System.out.println("Perimeter :"+peri);
	}
}

public class RectAreaPeri {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,3);
		r.area();
		r.perimeter(); 
	}

}
