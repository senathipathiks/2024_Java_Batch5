package Day2;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
	    for(int i:arr) {
	    	sum=sum+i;
	    }
	    System.out.println("Sum :"+sum);
	    float avg=sum/10;
	    System.out.println("Average :"+avg);
		

	}

}
