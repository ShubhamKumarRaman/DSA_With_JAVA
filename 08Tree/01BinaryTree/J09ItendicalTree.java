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
    }
}
