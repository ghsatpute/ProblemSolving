package datastructure.trees.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBstFromPreorderTraversalTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {10, 5, 1, 7, 40, 50};

        ConstructBstFromPreorderTraversal.Tree output = ConstructBstFromPreorderTraversal.solve(input);

        assertEquals(10, output.data);

        assertEquals(5, output.left.data);

        assertEquals(1, output.left.left.data);
        assertNull(output.left.left.left);
        assertNull(output.left.left.right);

        assertEquals(7, output.left.right.data);
        assertNull(output.left.right.left);
        assertNull(output.left.right.right);

        assertEquals(40, output.right.data);
        assertNull(output.right.left);

        assertEquals(50, output.right.right.data);
        assertNull(output.right.right.left);
        assertNull(output.right.right.right);
    }
}