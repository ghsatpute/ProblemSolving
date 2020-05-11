package problemsolving.hackerrank.datastructures.stacks.equalStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualStacksTest {

    @Test
    public void testCase01() {
        /*
                3
                2                       1
                1           4           4
                1           2           1
                1           2           1

             stack1      stack2       stack3
         */
        int[] stack1 = new int[] {3, 2, 1, 1, 1};
        int[] stack2 = new int[] {4, 3, 2};
        int[] stack3 = new int[] {1, 1, 4, 1};

        int result = EqualStacks.equalStacks(stack1, stack2, stack3);

        assertEquals(5, result);
    }

    @Test
    public void testCase02() {
        /*
                1       1       1
             stack1   stack2  stack3
         */
        int[] stack1 = new int[] {1};
        int[] stack2 = new int[] {1};
        int[] stack3 = new int[] {1};

        int result = EqualStacks.equalStacks(stack1, stack2, stack3);

        assertEquals(1, result);
    }

    @Test
    public void testCase03() {
        /*
                1                       1
                1           2           2
             stack1       stack2      stack3
         */
        int[] stack1 = new int[] {1, 1};
        int[] stack2 = new int[] {2};
        int[] stack3 = new int[] {1, 2};

        int result = EqualStacks.equalStacks(stack1, stack2, stack3);

        assertEquals(2, result);
    }
}
