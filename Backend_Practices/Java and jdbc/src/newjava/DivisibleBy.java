package newjava;

public class DivisibleBy {
	public static void main(String[] args) {
		System.out.print("Divisible by 3 and 5 in the range of 1 to 100 : \n");
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
