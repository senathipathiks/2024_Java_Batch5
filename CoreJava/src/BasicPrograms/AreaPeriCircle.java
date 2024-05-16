package BasicPrograms;

public class AreaPeriCircle {

	public static void main(String[] args) {
	
        double radius = Double.parseDouble(args[0]);
        
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
 
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    	}
}

// run in cmd
