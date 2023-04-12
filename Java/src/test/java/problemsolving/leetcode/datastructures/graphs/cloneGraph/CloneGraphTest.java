package problemsolving.leetcode.datastructures.graphs.cloneGraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CloneGraphTest {
    @Test
    public void testCase01() {
        CloneGraph.Node node1 = new CloneGraph.Node(1);

        CloneGraph.Node cloned = new CloneGraph().cloneGraph(node1);

        assertNotEquals(cloned, node1);
        assertEquals(cloned.val, node1.val);
        assertEquals(cloned.neighbors.size(), node1.neighbors.size());
    }

    @Test
    public void testCase02() {
        CloneGraph.Node node1 = new CloneGraph.Node(1);
        CloneGraph.Node node2 = new CloneGraph.Node(1);

        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        CloneGraph.Node cloned = new CloneGraph().cloneGraph(node1);

        assertNotEquals(cloned, node1);
        assertEquals(cloned.val, node1.val);
        assertEquals(cloned.neighbors.size(), node1.neighbors.size());

        assertNotEquals(cloned.neighbors.get(0), node1.neighbors.get(0));
        assertEquals(cloned.neighbors.get(0).val, node1.neighbors.get(0).val);
    }

}