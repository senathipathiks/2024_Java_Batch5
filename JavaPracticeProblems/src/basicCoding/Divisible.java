package basicCoding;

public class Divisible {

	public static void main(String[] args) {
		System.out.println("\n\nThe numbers that are divisible by 3 and 5 till 1 to 100 are : ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }
        
    }

	}


