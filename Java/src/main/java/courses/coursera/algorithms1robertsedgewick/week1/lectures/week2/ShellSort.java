package courses.coursera.algorithms1robertsedgewick.week1.lectures.week2;

public class ShellSort {
  public static void sort(int[] array) {
    int swapCount = 0;
    if (array == null || array.length <= 1) {
      return;
    }

    int h = 1;
    while (h < array.length) {
      h = 3 * h + 1;
    }

    while (h >= 1) {
      for (int i = h; i < array.length; i++) {
        for (int j = i; j >= h && array[j-h] > array[j]; j -= h) {
          swapCount++;
          swap(array, j, j-h);
        }
      }
      h = h/3;
    }

    System.out.println("Total swaps done " + swapCount);
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
