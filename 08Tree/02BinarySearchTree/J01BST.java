public class J01BST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Insert Node
    public static Node insertNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        } else {
            System.out.println("Duplicate node is not allowed.");
        }

        return root;
    }

    // Search Node
    public static boolean searchNode(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return searchNode(root.left, key);
        }
        return searchNode(root.right, key);
    }

    public static void main(String args[]) {

    }
}
