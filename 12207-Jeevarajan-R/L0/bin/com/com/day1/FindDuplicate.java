import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 5;
		int[] arr = new int[element];
		int[] arr2 = new int[element];
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < arr2.length-1; i++) {
			for(int j = i+1; j < arr2.length; j++) {
				if(arr[i] == arr[j]) {
					arr2[count] = arr[i];
					count++;
				}
				
			}
		}
		int len = 0;
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] != 0) {
				System.out.println(arr2[i]);
			}
		}
//		System.out.println(len);
		

	}

}
