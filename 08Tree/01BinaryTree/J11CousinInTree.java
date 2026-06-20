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

    // Using Depth First Search:
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

    // Using Depth First Search: Second Methods
    public static boolean isSiblings(Node root, int a, int b) {
        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null) {
            int x = root.left.data;
            int y = root.right.data;

            if ((x == a && y == b) || (x == b && y == a)) {
                return true;
            }
        }

        return isSiblings(root.left, a, b) || isSiblings(root.right, a, b);
    }

    public static int findLevel(Node root, int value, int level) {
        if (root == null) {
            return 0;
        }

        if (root.data == value) {
            return level;
        }

        int left = findLevel(root.left, value, level + 1);
        if (left != 0) {
            return left;
        }
        return findLevel(root.right, value, level + 1);
    }

    public static boolean isCousins(Node root, int a, int b) {
        if (a == b) {
            return false;
        }

        int aLevel = findLevel(root, a, 1);
        int bLevel = findLevel(root, b, 1);

        return !isSiblings(root, a, b) && aLevel == bLevel;
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

        Node root2 = new Node(17);

        root2.right = new Node(1);

        root2.right.left = new Node(12);
        root2.right.right = new Node(20);

        root2.right.left.left = new Node(13);
        root2.right.left.right = new Node(15);
        root2.right.right.left = new Node(11);
        root2.right.right.right = new Node(14);

        root2.right.left.left.left = new Node(21);
        root2.right.left.right.left = new Node(19);
        root2.right.right.left.left = new Node(16);
        root2.right.right.left.right = new Node(10);
        root2.right.right.right.left = new Node(5);

        root2.right.left.left.left.left = new Node(6);
        root2.right.left.left.left.right = new Node(9);
        root2.right.right.left.left.left = new Node(8);
        root2.right.right.left.left.right = new Node(2);
        root2.right.right.right.left.left = new Node(4);
        root2.right.right.right.left.right = new Node(18);

        root2.right.left.left.left.left.left = new Node(3);
        root2.right.left.left.left.left.right = new Node(7);

        System.out.println(isCousins(root2, 6, 5));
    }
}
