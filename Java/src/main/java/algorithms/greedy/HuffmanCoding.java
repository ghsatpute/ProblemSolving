package algorithms.greedy;

import datastructure.trees.heap.MinHeap;

import java.util.HashMap;
import java.util.Map;

public class HuffmanCoding {
    public static class HuffmanNode implements Comparable<HuffmanNode> {
        Character character;
        Integer count;
        HuffmanNode left;
        HuffmanNode right;

        @Override
        public int compareTo(HuffmanNode o) {
            return this.count.compareTo(o.count);
        }

        @Override
        public String toString() {
            return "Character: " + character + " Count: " + count;
        }
    }
    static class HuffmanCodingResult {
        public Map<Character, String> codes = new HashMap<>();
        public String encodedSting;
    }

    public static HuffmanCodingResult encode(String input) {
        HuffmanCodingResult codingResult = setup(input);
        StringBuilder output = new StringBuilder();
        for (Character ch: input.toCharArray()) {
            output.append(codingResult.codes.get(ch));
        }
        codingResult.encodedSting = output.toString();
        return codingResult;
     }

    private static HuffmanCodingResult setup(String input) {
        HuffmanCodingResult huffmanCodingResult = new HuffmanCodingResult();
        HuffmanNode huffmanTree = createHeap(input);
        createCode(huffmanTree, huffmanCodingResult.codes, "");
        return huffmanCodingResult;
    }

    private static void createCode(HuffmanNode huffmanTree, Map<Character, String> output, String current) {
        if (huffmanTree.right == null && huffmanTree.left == null) {
            output.put(huffmanTree.character, current.toString());
            return;
        }

        if (huffmanTree.right != null) {
            createCode(huffmanTree.right, output, current + "1");
        }
        if (huffmanTree.left != null) {
            createCode(huffmanTree.left, output, current + "0");
        }
    }

    private static HuffmanNode createHeap(String input) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch: input.toCharArray()) {
            result.merge(ch, 1, Integer::sum);
        }

        MinHeap<HuffmanNode> minHeap = new MinHeap<>();
        for (Map.Entry<Character, Integer> entry: result.entrySet()) {
            HuffmanNode huffmanNode = new HuffmanNode();
            huffmanNode.character = entry.getKey();
            huffmanNode.count = entry.getValue();
            minHeap.insert(huffmanNode);
        }

        MinHeap<HuffmanNode> output = new MinHeap<>();
        while (minHeap.size() > 1) {
            HuffmanNode item1 = minHeap.pop();
            HuffmanNode item2 = minHeap.pop();

            HuffmanNode newNode = new HuffmanNode();
            newNode.count = item1.count + item2.count;
            newNode.left = item1;
            newNode.right = item2;

            minHeap.insert(newNode);
        }

        return minHeap.pop();
    }
}
