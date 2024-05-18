package Day1;

public class Divisibleby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number which are divisible by 3 and 5 from range 1 to 100");
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
			
		}
	}

}
