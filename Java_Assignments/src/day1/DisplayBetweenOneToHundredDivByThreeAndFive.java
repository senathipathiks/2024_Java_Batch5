package day1;

public class DisplayBetweenOneToHundredDivByThreeAndFive {
	public static void main(String[] args) {
		System.out.println("NUMBER WHICH ARE DIVISIBLE BY 3 AND 5 IN THE RANGE 1 TO 100");
			for(int i=1;i<=100;i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i);
				}
			}

	}


}
