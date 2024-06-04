package basicCoding;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length <= 0) {
			System.out.println("Enter the integers in the command line");
			return;
		}
		String process = args[0];
		if(process.equalsIgnoreCase("Addition")) {
			System.out.println("Addition is "+(Integer.parseInt(args[1])+Integer.parseInt(args[2])));
		}
		if(process.equalsIgnoreCase("Subtraction")) {
			System.out.println("Subtraction is "+(Integer.parseInt(args[1])-Integer.parseInt(args[2])));
		}
		if(process.equalsIgnoreCase("Multiplication")) {
			System.out.println("Multiplication is "+(Integer.parseInt(args[1])*Integer.parseInt(args[2])));
		}
		if(process.equalsIgnoreCase("Division")) {
			System.out.println("Division is "+(Integer.parseInt(args[1])/Integer.parseInt(args[2])));
		}

	}

}
