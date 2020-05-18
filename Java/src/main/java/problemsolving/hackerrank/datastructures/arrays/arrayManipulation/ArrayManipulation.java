package problemsolving.hackerrank.datastructures.arrays.arrayManipulation;


public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {

        long[] differenceArray = new long[n];

        for (int[] query : queries) {
            int rangeStart = query[0];
            int rangeEnd = query[1];
            int value = query[2];

            differenceArray[rangeStart - 1] += value;
            if (rangeEnd < n) {
                differenceArray[rangeEnd] -= value;
            }
        }

        long max = 0;
        long temp = 0;

        for (long i: differenceArray) {
            temp += i;
            if (max < temp) {
                max = temp;
            }
        }

        return max;
    }
}
