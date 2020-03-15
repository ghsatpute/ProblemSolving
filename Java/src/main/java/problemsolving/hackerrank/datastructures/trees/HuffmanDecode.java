package problemsolving.hackerrank.datastructures.trees;

public class HuffmanDecode {
    class Node {
        char data;
        Node left, right;
    }
    // https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
    void decode(String s, Node root) {
        StringBuilder output = new StringBuilder();
        Node current = root;
        for (char ch: s.toCharArray()) {
            if (ch == '0') {
                current = current.left;
            } else if (ch == '1') {
                current = current.right;
            } else {
                throw new RuntimeException("Unexpected character " + ch);
            }
            if (current.left == null && current.right == null) {
                output.append(current.data);
                current = root;
            }
        }
        System.out.println(output);
    }

}
