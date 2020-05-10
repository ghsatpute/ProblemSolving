package problemsolving.hackerrank.datastructures.stacks.balancedBrackets;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void testCase01() {
        String input = "{[()]}";
        String output = BalancedBrackets.isBalanced(input);
        assertEquals("YES", output);
    }

    @Test
    public void testCase02() {
        String input = "{[(])}";
        String output = BalancedBrackets.isBalanced(input);
        assertEquals("NO", output);
    }

    @Test
    public void testCase03() {
        String input = "{{[[(())]]}}";
        String output = BalancedBrackets.isBalanced(input);
        assertEquals("YES", output);
    }

    @Test
    public void testCase04() {
        String input = "]]]";
        String output = BalancedBrackets.isBalanced(input);
        assertEquals("NO", output);
    }

}
