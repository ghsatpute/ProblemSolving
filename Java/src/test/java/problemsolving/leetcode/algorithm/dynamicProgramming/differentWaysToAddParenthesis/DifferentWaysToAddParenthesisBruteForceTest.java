package problemsolving.leetcode.algorithm.dynamicProgramming.differentWaysToAddParenthesis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class DifferentWaysToAddParenthesisBruteForceTest {
    @Test
    public void testCase01() {
        String token = "1+2";
        List<Integer> output = new DifferentWaysToAddParenthesisBruteForce().diffWaysToCompute(token);

        assertEquals(1, output.size());
        assertEquals(3, output.get(0));
    }

    @Test
    public void testCase02() {
        String token = "1+2+3";
        List<Integer> output = new DifferentWaysToAddParenthesisBruteForce().diffWaysToCompute(token);

        assertEquals(2, output.size());
        assertEquals(6, output.get(0));
        assertEquals(6, output.get(1));
    }

    @Test
    public void testCase03() {
        String token = "1+2+3+4";
        List<Integer> output = new DifferentWaysToAddParenthesisBruteForce().diffWaysToCompute(token);

        assertEquals(5, output.size());
        assertEquals(10, output.get(0));
        assertEquals(10, output.get(1));
        assertEquals(10, output.get(2));
        assertEquals(10, output.get(3));
        assertEquals(10, output.get(4));
    }

    @Test
    public void testCase04() {
        String token = "1+2+3+4+5";
        List<Integer> output = new DifferentWaysToAddParenthesisBruteForce().diffWaysToCompute(token);

        assertEquals(14, output.size());
        assertEquals(15, output.get(0));
        assertEquals(15, output.get(1));
        assertEquals(15, output.get(2));
        assertEquals(15, output.get(3));
        assertEquals(15, output.get(4));
    }

    @Ignore("Takes 27 seconds so skipping it. DP solution would run it in less time")
    @Test
    public void testCase05() {
        String token = "1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18";
        List<Integer> output = new DifferentWaysToAddParenthesisBruteForce().diffWaysToCompute(token);

        assertEquals(129644790, output.size());
    }
}