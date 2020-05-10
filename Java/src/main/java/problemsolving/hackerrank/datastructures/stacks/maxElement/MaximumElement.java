package problemsolving.hackerrank.datastructures.stacks.maxElement;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        // I could separate reading input and processing logic, but it's small problem so keeping it as it is
        Scanner scanner = new Scanner(System.in);
        int numQueries = Integer.parseInt(scanner.nextLine());
        int[] stack = new int[numQueries];
        int[] maxIndexes = new int[numQueries];
        int top = -1;

        for (int i = 0; i < numQueries; i++) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    int number = scanner.nextInt();
                    if (top == -1) {
                        maxIndexes[0] = 0;
                    } else if (number > stack[maxIndexes[top]]) {
                        // Current is the max one
                        maxIndexes[top + 1] = top + 1;
                    } else {
                        maxIndexes[top + 1] = maxIndexes[top];
                    }
                    stack[++top] = number;
                    break;
                case 2:
                    top--;
                    break;
                case 3:
                    System.out.println(stack[maxIndexes[top]]);
                    break;
                default:
                    System.out.println("Unsupported input");
            }
            if (i < numQueries - 1) {
                scanner.nextLine();
            }
        }
    }
}

