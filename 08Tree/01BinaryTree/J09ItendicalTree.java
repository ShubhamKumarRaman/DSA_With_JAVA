import java.util.LinkedList;
import java.util.Queue;

public class J09ItendicalTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // [Approach - 1] Using Recursion (DFS)
    public static boolean usingRecursion(Node n1, Node n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }

        return (n1.data == n2.data)
                && (usingRecursion(n1.left, n2.left))
                && (usingRecursion(n1.right, n2.right));
    }

    // [Approach - 2] Using Level Order Traversal (BFS)
    public static boolean usingLevelOrderTraversal(Node n1, Node n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }

        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(n1);
        q2.add(n2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            Node node1 = q1.poll();
            Node node2 = q2.poll();

            if (node1.data != node2.data) {
                return false;
            }

            // Check left child
            if (node1.left != null && node2.left != null) {
                q1.add(node1.left);
                q2.add(node2.left);
            } else if (node1.left != null || node2.left != null) {
                return false;
            }

            // Check right Child
            if (node1.right != null && node2.right != null) {
                q1.add(node1.right);
                q2.add(node2.right);
            } else if (node1.right != null || node2.right != null) {
                return false;
            }
        }

        return q1.isEmpty() && q1.isEmpty();
    }

    public static void main(String args[]) {

        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);
        r1.left.left = new Node(4);

        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(4);

        // using Recursion
        System.out.println("Using Recursion: " + (usingRecursion(r1, r2) ? "true" : "false"));
        System.out.println("Using Level Order Traversal: " + (usingLevelOrderTraversal(r1, r2) ? "true" : "false"));
    }
}
