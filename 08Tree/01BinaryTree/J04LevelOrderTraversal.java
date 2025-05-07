import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class J04LevelOrderTraversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // [Naive Approach] Using Recursion – O(n) time and O(n) space
    void levelOrderRec(Node root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.data);

        levelOrderRec(root.left, level + 1, result);
        levelOrderRec(root.right, level + 1, result);
    }

    List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderRec(root, 0, result);
        return result;
    }

    // [Expected Approach] Using Queue (Iterative) – O(n) time and O(n) space
    static List<List<Integer>> levelOrderItr(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int currentLevel = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            result.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                Node node = q.poll();
                result.get(currentLevel).add(node.data);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            currentLevel++;
        }
        return result;
    }

    public static void main(String args[]) {
        // 5
        // / \
        // 12 13
        // / \ \
        // 7 14 2
        // / \ / \ / \
        // 17 23 27 3 8 11

        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        J04LevelOrderTraversal tree = new J04LevelOrderTraversal();
        List<List<Integer>> res = tree.levelOrder(root);

        for (List<Integer> level : res) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1)
                    System.out.print(", ");
            }
            System.out.print("] ");
        }

        System.out.println();

        List<List<Integer>> res2 = levelOrderItr(root);

        // Print the result in the required format
        for (List<Integer> level : res2) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1)
                    System.out.print(", ");
            }
            System.out.print("] ");
        }
    }
}
