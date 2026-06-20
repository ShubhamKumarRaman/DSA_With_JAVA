public class J11CousinInTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Check two nodes are sibling or not
    public static boolean isSibling(Node root, int a, int b) {
        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null && root.left.data == a && root.right.data == b) {
            return true;
        }
        if (root.left != null && root.right != null && root.left.data == b && root.right.data == a) {
            return true;
        }

        return isSibling(root.left, a, b) || isSibling(root.right, a, b);
    }

    // Check the level of node
    public static int level(Node root, int value, int lev) {
        if (root == null) {
            return 0;
        }
        if (root.data == value) {
            return lev;
        }

        int left = level(root.left, value, lev + 1);
        if (left != 0) {
            return left;
        }
        return level(root.right, value, lev + 1);
    }

    // Check a and b is cousin or not
    public static boolean isCousin(Node root, int a, int b) {
        if (a == b) {
            return false;
        }

        int aLevel = level(root, a, 0);
        int bLevel = level(root, b, 0);

        if (aLevel == 0 || bLevel == 0) {
            return false;
        }

        return !isSibling(root, a, b) && aLevel == bLevel;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        int a = 4, b = 5;

        if (isCousin(root, a, b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
