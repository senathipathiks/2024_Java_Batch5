package Day1;

public class Areaandperimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("Give the radius in command line");
			return;
		}
		Double radius = Double.parseDouble(args[0]);
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter of the circle is: " + perimeter);
        System.out.println("Area of the circle is: " + area);

	}

	

}
