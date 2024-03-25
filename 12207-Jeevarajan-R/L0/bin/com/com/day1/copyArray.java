import java.util.Scanner;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 4, flag = 0;
		int[] arr = new int[element];
		int[] arr2 = new int[element];
		
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Array to be copied");
		for(int i = 0;i < arr2.length; i++ ) {
			arr2[i] = arr[i];
		}
		
		
		System.out.println("Printing Array 2");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}

	}

}
