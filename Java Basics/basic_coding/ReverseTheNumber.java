package basic_coding;
import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		String s = sc.next();
		String result = "";
		for(int i=s.length()-1 ;i>=0;i--) {
			result = result + s.charAt(i);
		}
		
		System.out.println(result);

	}

}
