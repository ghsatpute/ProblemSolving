package courses.coursera.algorithms1robertsedgewick.week1.lectures.week2;

public class SelectionSort {
  public static void sort(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }

    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i+1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      swap(array, i, minIndex);
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
