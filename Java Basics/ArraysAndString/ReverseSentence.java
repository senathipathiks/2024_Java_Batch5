package ArraysAndString;
import java.util.Scanner;
public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to reverse");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}

	}

}
