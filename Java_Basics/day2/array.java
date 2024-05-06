package day2;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr1 = new int[7]; // Moved this line here

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        arr1 = arr.clone(); // Cloning arr after user input

        if (arr == arr1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
