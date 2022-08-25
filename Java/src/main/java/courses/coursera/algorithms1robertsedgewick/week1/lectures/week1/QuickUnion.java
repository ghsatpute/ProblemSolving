package courses.coursera.algorithms1robertsedgewick.week1.lectures.week1;

public class QuickUnion {
  private int[] array;

  public QuickUnion(int size) {
    array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = i;
    }
  }

  private int root(int a) {
    while (array[a] != a) {
      a = array[a];
    }

    return a;
  }

  public void union(int a, int b) {
    int rootA = root(a);
    int rootB = root(b);

    array[rootA] = rootB;
  }

  public boolean isConnected(int a, int b) {
    int rootA = root(a);
    int rootB = root(b);

    return rootA == rootB;
  }
}
