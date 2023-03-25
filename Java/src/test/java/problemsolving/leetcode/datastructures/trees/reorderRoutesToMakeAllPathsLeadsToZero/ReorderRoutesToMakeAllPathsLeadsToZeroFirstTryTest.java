package problemsolving.leetcode.datastructures.trees.reorderRoutesToMakeAllPathsLeadsToZero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReorderRoutesToMakeAllPathsLeadsToZeroFirstTryTest {
    @Test
    public void testCase01() {
        int numNodes = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};

        int output = new ReorderRoutesToMakeAllPathsLeadsToZeroFirstTry().minReorder(numNodes, connections);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int numNodes = 5;
        int[][] connections = {{1,0},{1,2},{3,2},{3,4}};

        int output = new ReorderRoutesToMakeAllPathsLeadsToZeroFirstTry().minReorder(numNodes, connections);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        int numNodes = 3;
        int[][] connections = {{1,0},{2,0}};

        int output = new ReorderRoutesToMakeAllPathsLeadsToZeroFirstTry().minReorder(numNodes, connections);

        assertEquals(0, output);
    }
}