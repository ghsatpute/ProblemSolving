package problemsolving.hackerrank;

import java.util.Scanner;

public class SuffixRotation {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int rotations = solveProblem(s.toCharArray(), 0);
        }

        scanner.close();
    }
    private static int solveProblem(char[] input, int index) {

        if (input.length == index) {
            return 0;
        }

        char minChar = input[index];
        int minIndex = index;
        for (int i = index; i < input.length; i++) {
            if (input[i] < minChar) {
                minChar = input[i];
                minIndex = i;
            }
        }

        if (minIndex == index) {
            return solveProblem(input, index + 1);
        }

        boolean rotateToRight = true;

        int spanMid = index + (input.length - index) / 2;

        if (minIndex > spanMid) {
            rotateToRight = false;
        }

        rotate(input, index, minIndex, rotateToRight);

        return -1;
    }

    private static void rotate(char[] input, int start, int minIndex, boolean clockwise) {
        char[] copy = input.clone();
        for (int i = start; i < input.length; i++) {
        }
    }
}
