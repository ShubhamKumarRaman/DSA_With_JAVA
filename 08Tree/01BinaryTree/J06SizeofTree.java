// Write a program to Calculate Size of a tree | Recursion

public class J06SizeofTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Get size of tree
    public static int getSize(Node root) {
        if (root == null) {
            return 0;
        }

        int left = getSize(root.left);
        int right = getSize(root.right);

        return left + right + 1;
    }

    public static void main(String args[]) {
        // Constructed binary tree is
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Size of tree : "+getSize(root));
    }
}
