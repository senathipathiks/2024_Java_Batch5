package taskClass;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle = new Rectangle(7, 12);

		    System.out.println("The area of the rectangle is " + rectangle.getArea());
		    System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

		    rectangle.setWidth(6);
		    rectangle.setHeight(12);

		    System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
		    System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());

	}

}
