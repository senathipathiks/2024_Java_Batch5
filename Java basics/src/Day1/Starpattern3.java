package Day1;

import java.util.Scanner;

public class Starpattern3 {
	static void pattern(int n) {
	 for (int i=0; i<n; i++) 
     { 
     for (int j=n-i; j>1; j--) 
         { 
             System.out.print(" "); 
         }  
         for (int j=0; j<=i; j++ ) 
         { 
             System.out.print("* "); 
         } 

         System.out.println(); 
     } 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		pattern(b);


	}

}
