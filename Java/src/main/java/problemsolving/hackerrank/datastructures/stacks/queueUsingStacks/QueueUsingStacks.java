package problemsolving.hackerrank.datastructures.stacks.queueUsingStacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQueries = scanner.nextInt();
        int[][] queries = new int[numQueries][];
        for (int i = 0; i < numQueries; i++) {
            int opCode = scanner.nextInt();
            if (opCode == 1) {
                int item = scanner.nextInt();
                queries[i] = new int[] {opCode, item};
            } else {
                queries[i] = new int[] {opCode};
            }
            scanner.nextLine();
        }

        List<Integer> result = solution(queries);

        for (int i: result) {
            System.out.println(i);
        }
    }

    public static List<Integer> solution(int[][] queries) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int opCode = queries[i][0];
            switch (opCode) {
                case 1:
                    int item = queries[i][1];
                    stack1.push(item);
                    break;
                case 2:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    stack2.pop();
                    break;
                case 3:
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    }
                    result.add(stack2.peek());
            }
        }

        return result;
    }
}
