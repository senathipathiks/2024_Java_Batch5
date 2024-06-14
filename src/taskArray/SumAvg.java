package taskArray;
import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int[] arr=new int[10];
		System.out.println("Enter 10 values:");
		for(int i=0;i<10;i++) {
			arr[i]=s.nextInt();
			}
	int sum=0;
	for(int num:arr) {
		sum+=num;
	}
	double avg=(double)sum/arr.length;
	
	System.out.println("Sum:"+sum);
	System.out.println("Average:"+avg);
	}

}
