package Day2;

public class OddEvenPosition {
	
public static void main(String[] args) {
		
		int arr[]= {0,1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Odd Position:");
        for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("\nEven Position:");
		for(int i=2;i<arr.length;i+=2) {
			System.out.print(arr[i] +" ");
		}
		

	}

}
