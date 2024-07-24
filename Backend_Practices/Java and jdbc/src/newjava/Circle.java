package newjava;

public class Circle {
	

	public static void main(String[] args) {
		
		
		double radius = Double.parseDouble(args[0]);
		
		double area = Math.PI * radius * radius;
		
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println("Area of the circle: "+ area);
		
		System.out.println("Perimeter of the Circle: "+ perimeter);

}
	
}
