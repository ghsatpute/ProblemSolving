package courses.coursera.algorithms1robertsedgewick.week1.lectures.week1;

public class QuickFind {
  int[] array;
  public QuickFind(int size) {
    array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = i;
    }
  }

  public void union(int a, int b) {
    int valueA = array[a];
    int valueB = array[b];

    for (int i = 0; i < array.length; i++) {
      if (array[i] == valueA) {
        array[i] = valueB;
      }
    }
  }

  public boolean isConnected(int a, int b) {
    return array[a] == array[b];
  }
}
