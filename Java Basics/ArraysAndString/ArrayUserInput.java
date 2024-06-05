package ArraysAndString;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		int sum = 0;
		float avg = 0;
		for(int i=0;i<10;i++) {
			System.out.println("Enter the element: ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("SUM OF ARRAY ELEMENT :"+sum);
		System.out.println("AVERAGE ARRAY ELEMENT :"+sum/10);
		
		

	}

}
