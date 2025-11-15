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

    public static void main(String args[]) {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        System.out.println("Using Check Every Node: "+isSumTree(root));
    }
}
