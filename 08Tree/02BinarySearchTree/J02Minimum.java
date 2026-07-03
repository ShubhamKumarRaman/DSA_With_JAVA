import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class J02Minimum {
    static class Node {
        int data;
        Node left, right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node root = null;

    // [Naive Approach] Using Inorder Traversal - O(n) Time and O(n) Space
    public static void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    public static int minValueInOrder(Node root) {
        if (root == null) {
            return -1;
        }
        ArrayList<Integer> sortedList = new ArrayList<>();
        inOrder(root, sortedList);
        return sortedList.get(0);
    }

    public static void printLevelOrder() {
        if (root == null)
            return;

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

                    // Add children to the queue for the next level
                    queue.add(curr.left);
                    queue.add(curr.right);

                    // Check if there is at least one real node in the next level
                    if (curr.left != null || curr.right != null) {
                        hasNextLevel = true;
                    }
                } else {
                    // Node is null, print 'N' and don't add children
                    levelOutput.append("N ");
                }
            }

            // Print the current level
            System.out.println(levelOutput.toString().trim());

            // Stop if the next level consists entirely of nulls
            if (!hasNextLevel) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        root = new Node(50);

        // 2. Manually create and attach the level 1 children
        root.left = new Node(30);
        root.right = new Node(70);

        // 3. Manually create and attach the level 2 children (Left Subtree)
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        // 4. Manually create and attach the level 2 children (Right Subtree)
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root.left.left.right = new Node(25);

        printLevelOrder();

        System.out.println("Approach 1:- " + minValueInOrder(root));

    }
}
