package day2;


import java.util.Arrays;
import java.util.Scanner;

public class LongSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of inputs:");
		int s = sc.nextInt();
		System.out.println("Enter the values");
		int arr [] = new int[s];
				
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
//		Arrays.sort(arr);
		int ans = 0, count = 0, start = 0, end = 0, x = 0, y = 0;
		 

	    for (int i = 0; i < arr.length; i++) {
	 
	        if (i > 0 && arr[i] == arr[i - 1] + 1) {
	            count++;
	            end = i;
	        }
	        else {
	            start = i;
	            count = 1;
	        }
	 
	        if (ans < count) {
	            ans = count;
	            x = start;
	            y = end;
	        }
	    }
	 
	    for (int i = x; i <= y; i++)
	      System.out.print(arr[i] + " ");
	}

}
