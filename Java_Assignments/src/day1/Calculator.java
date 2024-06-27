package day1;
//run this code in cmd
public class Calculator {

	public static void main(String args[]) {
		if(args.length <= 0){
			System.out.println("Give the input in command line");
			return;
		}
		String process = args[0];
		if(process.equalsIgnoreCase("ADDITION")) {
			System.out.println("ADDITION "+(Integer.parseInt(args[1])+Integer.parseInt(args[2])));
		}
		else if(process.equalsIgnoreCase("SUBTRACTION")) {
			System.out.println("SUBTRACTION "+(Integer.parseInt(args[1])-Integer.parseInt(args[2])));
		}
		else if(process.equalsIgnoreCase("DIVISION")) {
			System.out.println("DIVISION "+(Integer.parseInt(args[1])/Integer.parseInt(args[2])));
		}
		else if(process.equalsIgnoreCase("MULTIPLICATION")) {
			System.out.println("MULTIPLICATION "+(Integer.parseInt(args[1])*Integer.parseInt(args[2])));
		}

	}

}