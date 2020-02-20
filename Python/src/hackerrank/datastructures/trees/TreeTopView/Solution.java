import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
	
    /* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {

        Integer[] topView = new Integer[1001];

        Queue<Map.Entry<Node, Integer>> queue = new LinkedList<>();

        queue.add(new AbstractMap.SimpleEntry<Node, Integer>(root, 500));
        topView[500] = root.data; 

        while (queue.peek() != null) {
            Node current = queue.peek().getKey();
            Integer currentIndex = queue.peek().getValue();
            queue.remove();

            if (current.left != null) {
                if (topView[currentIndex - 1] == null) {
                    topView[currentIndex - 1] = current.left.data; 
                }
                queue.add(new AbstractMap.SimpleEntry<Node, Integer>(current.left, currentIndex - 1));
            }

            if (current.right != null) {
                if (topView[currentIndex + 1] == null) {
                     topView[currentIndex + 1] = current.right.data;
                }
                queue.add(new AbstractMap.SimpleEntry<Node, Integer>(current.right, currentIndex + 1));
            }
        }

        for (int i = 0; i < 1001; i++) {
            if (topView[i] != null) {
                System.out.print(topView[i] + " ");
            }
        }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
