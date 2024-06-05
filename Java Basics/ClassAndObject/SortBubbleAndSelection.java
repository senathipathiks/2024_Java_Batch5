package ClassAndObject;

import java.util.Scanner;

interface Sort {
    int[] sorting(int a[], int length);
}

class SelectionSort implements Sort {
    public int[] sorting(int a[], int length) {
    	for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
        return a;
    }
}
class BubbleSort implements Sort {
    public int[] sorting(int a[], int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}

public class SortBubbleAndSelection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements to be entered");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            a[i] = sc.nextInt();
        }

        BubbleSort BS = new BubbleSort();
        int a1[] = BS.sorting(a, a.length);

        System.out.println("Bubble Sort array:");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        
        SelectionSort SS = new SelectionSort();
        int a2[] = SS.sorting(a, a.length);
        
        System.out.println("Selction Sort array:");
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        
    }
}
