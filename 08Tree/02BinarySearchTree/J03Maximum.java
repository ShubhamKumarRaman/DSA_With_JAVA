import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class J03Maximum {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean hasNextLevel = false;
            StringBuilder levelOutput = new StringBuilder();

            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();

                if (curr != null) {
                    levelOutput.append(curr.data).append(" ");

                    queue.add(curr.left);
                    queue.add(curr.right);

                    if (curr.left != null || curr.right != null) {
                        hasNextLevel = true;
                    }
                } else {
                    levelOutput.append("N ");
                }
            }

            System.out.println(levelOutput.toString().trim());

            if (!hasNextLevel) {
                break;
            }
        }
    }

    static Node root = null;

    // [Naive Approach] Using Inorder Traversal – O(n) Time and O(n) Space
    public static void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    public static int maxValueInOrder(Node root) {
        if (root == null) {
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(list.size() - 1);
    }

    // [Better Approach] Using Recursion - O(h) Time and O(h) Space
    public static int maxValueRecursion(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.right == null) {
            return root.data;
        }
        return maxValueRecursion(root.right);
    }

    // [Expected Approach] Traversing Across Right Edges Only – O(h) Time and O(1)
    // Space
    public static int maxValueIterative(Node root) {
        if (root == null) {
            return -1;
        }
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }

    public static void main(String args[]) {
        root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.right.right = new Node(7);
        root.left.left.left = new Node(1);

        printTree(root);

        System.out.println("Approach 1:- " + maxValueInOrder(root));
        System.out.println("Approach 2:- " + maxValueRecursion(root));
        System.out.println("Approach 3:- " + maxValueIterative(root));
    }
}
