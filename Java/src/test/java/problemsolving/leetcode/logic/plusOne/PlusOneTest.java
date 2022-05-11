package problemsolving.leetcode.logic.plusOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    public void test1() {
        int[] input = {1};

        int[] output = PlusOne.plusOne(input);

        Assertions.assertArrayEquals(output, new int[] {2});
    }

    @Test
    public void test2() {
        int[] input = {9,9,9};

        int[] output = PlusOne.plusOne(input);

        Assertions.assertArrayEquals(output, new int[] {1,0,0,0});
    }
}