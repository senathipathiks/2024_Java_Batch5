import java.util.Scanner;
public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int element = 4, flag = 0;
		int[] arr = new int[element];
		
		System.out.println("Enter "+ element + " Elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Search Element : ");
		int search = sc.nextInt();
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				idx = i;
				System.out.println("Element Found in index "+ idx);
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if(flag == 1) {System.out.print(search + " Element Not Found!");}

	}

}
