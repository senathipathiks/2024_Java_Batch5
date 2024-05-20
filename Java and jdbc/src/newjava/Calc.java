package newjava;


public class Calc {
	
	public static void main(String[] args) {
		
	String operator = args[0];

	double operand1 = Double.parseDouble(args[1]);
	
	double operand2 = Double.parseDouble(args[2]);
	
	double result = 0;
	
	String ch = operator;
	
	switch(ch) {
	
	case "Add":
		result = operand1 + operand2;
		break;
		
	case "Sub":
		result = operand1 - operand2;
		break;
		
	case "Mul":
		result = operand1 * operand2;
		break;
		
	case "Div":
		if(operand2 != 0 || operand1 != 0) {
		result = operand1 / operand2;
		}
		else {
			System.out.println("Error: Division by Zero");
			return;
		}
		break;
		
	default	:
		System.out.println("Error: Invalid operator");
		return;
	}
	
	System.out.println("Result: "+result);

	
}
}