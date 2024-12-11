package day2;
import  java.util.*;
public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    int arr[] = new int[10];
    int sum=0;
    for (int i=0;i<10;i++) {
    	arr[i]=s.nextInt();
    	sum+=arr[i];
    }
    int avg=sum/10;
    System.out.println("sum is "+sum +" Average is"+avg);
	}

}
