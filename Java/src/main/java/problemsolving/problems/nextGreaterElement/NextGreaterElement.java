package problemsolving.problems.nextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] solve(int[] numbers) {
        int[] output = new int[numbers.length];
        Arrays.fill(output, -1);

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.empty() && numbers[stack.peek()] < numbers[i]) {
                output[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return output;
    }
}
