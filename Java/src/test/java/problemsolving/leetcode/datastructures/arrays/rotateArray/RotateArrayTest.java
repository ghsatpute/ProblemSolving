package problemsolving.leetcode.datastructures.arrays.rotateArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void sevenNumbersAndKIsThree() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, new int[]{5, 6, 7, 1, 2, 3, 4});
    }

    @Test
    public void sixNumbersAndKIsThree() {
        int[] nums = new int[]{1,2,3,4,5,6};
        int k = 3;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, new int[]{4, 5, 6, 1, 2, 3});
    }

    @Test
    public void sixNumbersAndKIsSix() {
        int[] nums = new int[]{1,2,3,4,5,6};
        int k = 6;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, new int[]{1,2,3,4,5,6});
    }
}