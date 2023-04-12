package problemsolving.leetcode.datastructures.graphs.cloneGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Integer, Node> nodeMap = new HashMap<>();

        return cloneGraph(nodeMap, node);
    }

    private Node cloneGraph(Map<Integer, Node> nodeMap, Node node) {
        if (nodeMap.containsKey(node.val)) {
            return nodeMap.get(node.val);
        }

        Node clone = new Node();
        clone.val = node.val;
        nodeMap.put(node.val, clone);

        for (Node neighbor: node.neighbors) {
            Node neighborClone = cloneGraph(nodeMap, neighbor);
            clone.neighbors.add(neighborClone);
        }

        return clone;
    }
}
