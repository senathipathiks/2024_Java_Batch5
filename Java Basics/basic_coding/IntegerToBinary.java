package basic_coding;
import java.util.Scanner;
public class IntegerToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert integer to binary");
		int number = sc.nextInt();
		String result = "";
		while(number != 0) {
			result = result + number%2;
			number = number/2;
		}
		System.out.println("Binary Code");
		for(int i=result.length()-1;i>=0;i--) {
			System.out.print(result.charAt(i));
		}
	}

}
