package problemsolving.leetcode.logic.firstMissingPositive;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstMissingPositiveTest {
    @Test
    public void testCase01() {
        int[] input = new int[]{3, 4, -1, 1};

        int output = new FirstMissingPositive().firstMissingPositive(input);

        assertEquals(2, output);
    }


    @Test
    public void testCase02() {
        int[] input = new int[]{7,8,9,11,12};

        int output = new FirstMissingPositive().firstMissingPositive(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[]{1,3,5,2,4};

        int output = new FirstMissingPositive().firstMissingPositive(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[]{1,3,5,7,9,2,4};

        int output = new FirstMissingPositive().firstMissingPositive(input);

        assertEquals(6, output);
    }
}
