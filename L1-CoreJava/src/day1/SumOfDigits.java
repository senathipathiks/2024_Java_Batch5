package day1;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int num = in.nextInt();
		int sum = 0;
		
		while(num > 0) {
			sum = sum + num% 10;
			num /= 10;
		}
		
		System.out.println("Sum of the digits is "+ sum);

	}

}
