package day2;

public class copyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			        int[] originalArray = new int[] { -5, -9, 8, 12, 1, 3, 10, 34, 57, 89, 24 };
			        int[] copiedArray = new int[originalArray.length];

			        // Copy values from originalArray to copiedArray
			        for (int i = 0; i < originalArray.length; i++) {
			            copiedArray[i] = originalArray[i];
			        }

			        // Print copied array
			        System.out.print("Copied array : ");
			        for (int i = 0; i < copiedArray.length; i++) {
			            System.out.print(copiedArray[i] + " ");
			        }
	}

}
