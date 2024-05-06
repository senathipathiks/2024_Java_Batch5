package day2;
import java.util.*;
public class Java_Arrays_declaration {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int []arr=new int[5];
		System.out.println(arr[0]); //default value is zero
		System.out.println(arr.length);
		
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		
		
		
//		----->  Enhanced for loop ------->
		for(int i : arr) {
			System.out.println(i);
			
		}
		// TODO Auto-generated method stub

	}

}
