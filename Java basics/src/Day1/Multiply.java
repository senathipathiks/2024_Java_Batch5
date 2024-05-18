package Day1;
import java.util.Scanner;

public class Multiply {
	
	static void table(int m) {
		System.out.println("The multiplication table is : ");
	
	for(int i = 1; i <= 10; i++) {
		System.out.println(m + "*" + i + "=" + m * i );
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		table(a);
		

	}

}
