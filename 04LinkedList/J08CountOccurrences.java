public class J08CountOccurrences {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // [Naive Approach] By Recursion – O(n) time and O(n) space
    public static int usingRecursion(Node head, int key) {
        if (head == null) {
            return 0;
        }
        int ans = usingRecursion(head.next, key);
        if (head.data == key) {
            ans++;
        }
        return ans;
    }

    // [Expected Approach] By Traversing each node – O(n) time and O(1) space
    public static int usingTraversingAll(Node head, int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key)
                count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println("Number of occurrence: " + usingTraversingAll(head, 1));
        System.out.println("Number of occurrence: " + usingRecursion(head, 2));
    }
}
