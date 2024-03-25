// Selection sort in Java
package selection;
import java.util.*;

class Select {
  void select(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int[] arr = { 20, 12, 10, 15, 2 };
    Select ss = new Select();
    ss.select(arr);
    System.out.println("Sorted Array: ");
    System.out.println(Arrays.toString(arr));
  }
}