public class J08SumTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // [Naive Approach] By Checking Every Node - O(n^2) Time and O(h) Space:
    public static boolean isSumTree(Node root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        int ls = countSum(root.left);
        int rs = countSum(root.right);

        return (root.data == ls + rs) && isSumTree(root.left) && isSumTree(root.right);
    }

    public static int countSum(Node root) {
        if (root == null) {
            return 0;
        }
        return countSum(root.left) + root.data + countSum(root.right);
    }

    // [Expected Approach] Calculating left and right subtree sum directly - O(n)
    // Time and O(h) Space:
    public static boolean isLeaf(Node root) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public static boolean checkSumTree(Node root) {
        if (root == null || isLeaf(root)) {
            return true;
        }
        int ls, rs = 0;
        if (checkSumTree(root.left) && checkSumTree(root.right)) {
            if (root.left == null) {
                ls = 0;
            } else if (isLeaf(root.left)) {
                ls = root.left.data;
            } else {
                ls = 2 * root.left.data;
            }

            if (root.right == null) {
                rs = 0;
            } else if (isLeaf(root.right)) {
                rs = root.right.data;
            } else {
                rs = 2 * root.right.data;
            }

            return root.data == ls + rs;
        }
        return false;
    }

    public static void main(String args[]) {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        System.out.println("Using Check Every Node: " + isSumTree(root));
        System.out.println("Using Check SubTree Sum: "+checkSumTree(root));
    }
}
