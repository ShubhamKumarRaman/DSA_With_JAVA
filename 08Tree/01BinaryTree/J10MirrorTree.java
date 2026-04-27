public class J10MirrorTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // [Expected Approach - 1] Recursive Approach - O(n) Time and O(h) Space
    public static boolean isMirror(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 == null || head2 == null) {
            return false;
        }

        return ((head1.data == head2.data) && (isMirror(head1.left, head2.right))
                && (isMirror(head1.right, head2.left)));
    }

    public static void main(String args[]) {
        // First Tree
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        // Second Tree
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        // root2.left.right.left = new Node(11);

        if (isMirror(root1, root2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
