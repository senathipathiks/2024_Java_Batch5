package taskArray;
import java.util.*;

public class OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int inputArray[] = new int[] { 100, 500, 450, 200, 1000, 213, 750 };
		        
		        System.out.println("Existing array elements:");
		        for (int i = 0; i < inputArray.length; i++) {
		            System.out.println(inputArray[i]);
		        }
		        
		        System.out.println("Array elements at odd position:");
		        int flag = 1;
		        for (int i = 0; i < inputArray.length; i++) {
		            if (flag == 1) {
		                System.out.print(inputArray[i] + " ");
		                flag = 0;
		            } else {
		                flag = 1;
		            }
		        }
		    }
		

	}


