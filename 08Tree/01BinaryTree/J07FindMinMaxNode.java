// Find maximum (or minimum) in Binary Tree

public class J07FindMinMaxNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Find the maximum node
    public static int findMaximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        int lmax = findMaximum(root.left);
        int rmax = findMaximum(root.right);

        if (lmax > max) {
            max = lmax;
        }
        if (rmax > max) {
            max = rmax;
        }
        return max;
    }

    // Find the minimum node
    public static int findMinimum(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int min = root.data;
        int lmin = findMinimum(root.left);
        int rmin = findMinimum(root.right);

        if (lmin < min) {
            min = lmin;
        }
        if (rmin < min) {
            min = rmin;
        }
        return min;
    }

    public static void main(String args[]) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.right = new Node(6);
        root.left.right.left = new Node(1);
        root.left.right.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(14);

        System.out.println("Minimum element of tree: " + findMinimum(root));
        System.out.println("Maximum element of tree: " + findMaximum(root));
    }
}
