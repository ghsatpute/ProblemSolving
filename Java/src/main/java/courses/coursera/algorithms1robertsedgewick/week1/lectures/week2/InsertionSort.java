package courses.coursera.algorithms1robertsedgewick.week1.lectures.week2;

public class InsertionSort {
  public static void sort(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }

    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j-1] > array[j]) {
          swap(array, j-1, j);
        }
      }
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
