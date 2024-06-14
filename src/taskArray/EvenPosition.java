package taskArray;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		        System.out.println("Existing array elements:");
//		        for (int i = 0; i < arr.length; i++) {
//		            System.out.println(arr[i]);
//		        }
	        for(int i:arr) {
System.out.println(i);
      }
		        System.out.println("Array elements at even position:");
		        int i = 1;
		        while (i < arr.length) {
		            System.out.println(arr[i]);
		            i += 2;
		        }
		    }
		

	}


