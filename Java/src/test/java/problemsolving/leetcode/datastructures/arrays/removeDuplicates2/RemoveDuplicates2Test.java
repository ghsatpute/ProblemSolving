package problemsolving.leetcode.datastructures.arrays.removeDuplicates2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicates2Test {
    @Test
    public void testCase01() {
        int[] input = new int[] {1,1,1,2,2,3};
        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();
        int output = removeDuplicates2.removeDuplicates(input);

        assertEquals(5, output);
    }
}