package day2;

import java.util.Arrays;
import java.util.Scanner;


public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   int arr[] =new int[5];
   int arr1[] = new int[5];
   int arr2[] = new int[5];
   for(int i=0;i<5;i++) {
	   arr[i]=s.nextInt();
	   }
   for(int  e : arr) {
	   System.out.println(e);
   }
   System.arraycopy(arr, 0, arr1, 0, 5);
   System.out.println(Arrays.toString(arr1));
   arr2=arr;
   
   
   if(arr == arr1) {
	   System.out.println("Diff mem alocation");
   }
    if(arr == arr2) {
	   System.out.println("same mem allocation");
   }
	}
	
     
}
